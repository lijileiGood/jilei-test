package com.github.lijileiGood;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MsToTime {

    private final static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");


    public static void main(String[] args) {
        System.out.println("15:05".equals(timeFormatter.format(LocalDateTime.now())));
//        LocalDate localDate = LocalDate.now().plusDays(-15);
//        System.out.println(dateFormatter.format(localDate));
//
//
//        double aaa = Double.parseDouble("0.001686781644821167");
//        double aDouble = Double.parseDouble("0.0016866");
//        System.out.println(aaa > aDouble);


//        LocalDate startDate = LocalDate.parse("2022-10-12", dateFormatter);
//        System.out.println(LocalDate.now().isBefore(startDate));
    }

}
