package com.yyin.oop_class;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    /**
     *
     月份陷阱
     Calendar类的 MONTH字段并不像我们在其他地方写下日期般从1到12。
     取而代之的是月份从0走到11，0是1月，11是12月份。如果你不知道这个的话，它将会引发一点错误和随其而来的调试。
     星期几误区
     如你希望的那样，星期是从1走到7，但是每周的第一天是周六而不是周一。
     这意味着1 = sunday, 2 = monday, …, 7 = Saturday。这也时不时地让我感到有点烦恼。
     */
    public static void main(String[] args) {
        //获取
        Calendar calendar = new GregorianCalendar();
        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println("一周中第"+dayOfWeek+"天；一年中第"+weekOfYear+"周;一月中第"+weekOfMonth+"周");
        System.out.println(new GregorianCalendar(1999, 11, 31).get(Calendar.MONTH));
        //11 -> 12月 我们用常量 Calendar.DECEMBER 表示12月

        //设置
        Calendar deadline= new GregorianCalendar();
        deadline.set(2018,6,6);
        deadline.add(Calendar.DAY_OF_MONTH, -1);
    }
}
