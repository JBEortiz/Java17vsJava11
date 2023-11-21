package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SupportForDaytimePeriods {

    public static void main(String[] args) {
        /*
        Se agrega un nuevo patrón Bpara formatear DateTimeque indica un período de día
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B");
        System.out.println(dtf.format(LocalTime.of(8, 0)));
        System.out.println(dtf.format(LocalTime.of(13, 0)));
        System.out.println(dtf.format(LocalTime.of(20, 0)));
        System.out.println(dtf.format(LocalTime.of(23, 0)));
        System.out.println(dtf.format(LocalTime.of(0, 0)));
        /*
         En japones
         */
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("B", Locale.forLanguageTag("ja"));
        System.out.println(dtf2.format(LocalTime.of(8, 0)));
        System.out.println(dtf2.format(LocalTime.of(13, 0)));
        System.out.println(dtf2.format(LocalTime.of(20, 0)));
        System.out.println(dtf2.format(LocalTime.of(23, 0)));
        System.out.println(dtf2.format(LocalTime.of(0, 0)));
    }
}
