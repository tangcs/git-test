package com.dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTransfer {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2018-03-04");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        String dateStr = sdf1.format(date);
        System.out.println(dateStr);
    }
}
