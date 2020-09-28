package com.atguigu.bigdata.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class java06_Date {
    public static void main(String[] args)throws Exception {
        //日期格式化
        Date parse = parse("2020-04-28 11:11:11", "yyyy-MM-dd HH:mm:ss");
        System.out.println(parse);
        Date parse1 = parse("2020-04-28 11:11:11");
        System.out.println(parse1);
    }

    private static Date parse(String date, String format) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(date);
    }

    public static Date parse(String date) throws Exception{ ;
        return parse(date,"yyyy-MM-dd HH:mm:ss");
    }
}
