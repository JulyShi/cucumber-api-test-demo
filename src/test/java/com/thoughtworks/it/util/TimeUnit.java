package com.thoughtworks.it.util;

import java.time.LocalDateTime;

public class TimeUnit {
    public static String currentMills(){return String.valueOf(DateTime.now().getMillis());}

    public static String currentDateTime(){return String.LocalDateTime.now.format(ofPattern("yyyy-MM-dd HH:mm:ss"));}

    public static String nowPlusOrMinusDays(Long days){
        return LocalDateTime.now().plusDays(days).format(ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static String nowPlusOrMinusMinutes(Interger minutes, org.joda.time.DateTimeFormatter formatter){
        return DateTime.now().plusMinutes(minutes).toString(formatter);
    }

    public static String nowPlusOrMinusMinutes(Interger minutes){
        LocalDateTime.now();
        return LocalDateTime.now().plusMinutes(minutes).format(ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
