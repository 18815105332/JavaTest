//18计本1_18210559009_武文浩_JAVA0903
package com.InheritanceAndPolymorphism.CalendarDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendars {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millionSecond = cal.get(Calendar.MILLISECOND);
        System.out.println("当前时间：");
        String strTime = String.format("%d-%02d-%02d %02d:%02d:%02d:%s",
                year,month,day,hour,minute,second,millionSecond);
        System.out.println(strTime);

//        cal.set(2012,5,12,14,28,4);
//        Date date = cal.getTime();
//        System.out.println(date.toLocaleString());
//
//        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss:sss");
//        String strDate = format.format(date);
//        System.out.println(strDate);
//
//        Date newDate = format.parse("2017-12-30 23:59:59:999");
//        System.out.println(newDate.toGMTString());
        GregorianCalendar cal2 = new GregorianCalendar(2017,(8-1),9);
        long diff = Math.abs(cal.getTimeInMillis()-cal2.getTimeInMillis());
        int diffDays = (int) (diff/1000/60/60/24);
        System.out.println("相差"+diffDays+"天");

        cal.add(Calendar.YEAR,3);
        System.out.println(cal.get(Calendar.YEAR));
    }
}
