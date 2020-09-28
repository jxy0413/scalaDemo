package com.atguigu.bigdata.test;

public class Java11_Override {
    public static void main(String[] args) {

    }
}
class AAA{
    public int i = 10;
    public int getResult(){
        return i+10;
    }
}
class BBB extends AAA{
    public int i = 20;
    public int getResult(){
        return i+10;
    }
}