package com.dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigInteger;
public class DateTest {
    public static void main(String[] args) {
        Date time=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = df.format(time);
        System.out.println(timeStr);
    }
}
