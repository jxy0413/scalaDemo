package com.atguigu.bigdata.test;

import java.util.HashSet;
import java.util.Set;

public class Java15Set {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        System.out.println(set.toArray().length);
    }
}
