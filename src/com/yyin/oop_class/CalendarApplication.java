package com.yyin.oop_class;

import jdk.nashorn.internal.ir.WhileNode;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarApplication {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH,1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        int firstDayOfWeek = d.getFirstDayOfWeek();

        //determine the require indentation for the first line
        int indent = 0;
        while(weekday !=firstDayOfWeek){
            indent ++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        //getShortWeekdays 获取当前地区的星期或月份的名称，用Calendar的常量作为数组的索引
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        while (weekday!=firstDayOfWeek);

        System.out.println();
        for (int i = 1; i < indent; i++)
            System.out.print("         ");

        d.set(Calendar.DAY_OF_MONTH,1);
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);

            if (day == today)System.out.print("*  ");
            else System.out.print("   ");

            d.add(Calendar.DAY_OF_MONTH,1);
            weekday= d.get(Calendar.DAY_OF_WEEK);

            if(weekday == firstDayOfWeek) System.out.println();
        }
        while (d.get(Calendar.MONTH)==month);
        if (weekday!= firstDayOfWeek) System.out.println();

    }
}