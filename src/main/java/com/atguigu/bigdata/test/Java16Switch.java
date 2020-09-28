package com.atguigu.bigdata.test;

public class Java16Switch {
    public static void main(String[] args) {
        int i = 2;
        switch (i){
            case 0 :
                break;
            case 1 :
               System.out.println(i);
               break;
            default:
                System.out.println(i+" dd");
                break;
        }
    }
}
