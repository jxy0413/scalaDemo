package com.atguigu.bigdata.test;

public class Java07_Exception {
    public static void main(String[] args) {
        try{
            int i = 10;
            int j = 0;
            int z = i / j ;
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("exception");
        }finally {
            System.out.println("finally .....");
        }
    }
}
