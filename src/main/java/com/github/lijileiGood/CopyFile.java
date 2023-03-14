package com.github.lijileiGood;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;


public class CopyFile {



    public static void main(String[] args) throws IOException {
        List<String> dirList = Arrays.asList("123", "456");
        for (String dir : dirList) {
            File file = new File("/home/leo/desktop/picture/" + dir);
            file.mkdir();
        }
        String a = "/home/leo/desktop/opt/pic/2022-05-02/东讯/11/2606635548852351025/印刷文件/03竖12寸硬壳高端对裱照片书24p_2305566879_细格纹经典款_第3幅(03-04)_共12.jpg";
        File source = new File(a);
        String name = FileUtil.getName(a);
        File dest = new File("/home/leo/desktop/picture/" + "123/" + name);
        copyFileUsingFileChannels(source, dest);
        System.out.println("---------------------");
    }

    private static void copyFileUsingFileChannels(File source, File dest) throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }


}
