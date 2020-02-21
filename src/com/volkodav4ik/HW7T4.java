package com.volkodav4ik;

/*4*. Задана строка с датой вида "22.01.2019 19:15:00". Написать метод который преобразовывает ее в
формат "22 Jan, 7:15 PM". Предусмотреть обработку ситуации если входящая дата в недопустимом формате.*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HW7T4 {
    private static final String INPUT_DATE = "22.01.2019 19:15:00";
    private static final String INPUT_DATE_FORMAT = "dd.MM.yyyy HH:mm:ss";
    private static final String OUTPUT_DATE_FORMAT = "d MMM, h:mm a";

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime date = null;
        try {
            date = LocalDateTime.parse(INPUT_DATE, formatter);
        } catch (Exception e) {
            System.out.println("Unsupported date format, please use " + INPUT_DATE_FORMAT + " format");
        }
        System.out.println(formatDateTime(date));
    }

    private static String formatDateTime(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(OUTPUT_DATE_FORMAT, Locale.US);
        String newDate = date.format(formatter);
        return newDate;
    }
}

