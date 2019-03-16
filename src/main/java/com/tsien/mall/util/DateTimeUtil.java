package com.tsien.mall.util;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/3/16 0016 19:59
 */

public class DateTimeUtil {

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";


    public static LocalDateTime strToDate(String dateTimeStr, String formatStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatStr);
        return LocalDateTime.parse(dateTimeStr, dateTimeFormatter);
    }

    public static String dateToStr(LocalDateTime dateTime, String formatStr) {
        if (dateTime == null) {
            return StringUtils.EMPTY;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatStr);
        return dateTime.format(dateTimeFormatter);
    }

    public static LocalDateTime strToDate(String dateTimeStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(STANDARD_FORMAT);
        return LocalDateTime.parse(dateTimeStr, dateTimeFormatter);
    }

    public static String dateToStr(LocalDateTime dateTime) {
        if (dateTime == null) {
            return StringUtils.EMPTY;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(STANDARD_FORMAT);
        return dateTime.format(dateTimeFormatter);
    }


    public static void main(String[] args) {
        System.out.println(DateTimeUtil.dateToStr(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTimeUtil.strToDate("2010-01-01 11:11:11", "yyyy-MM-dd HH:mm:ss"));
    }
}
