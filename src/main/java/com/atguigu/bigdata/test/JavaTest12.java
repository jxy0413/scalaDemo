package com.atguigu.bigdata.test;

public class JavaTest12 {
    public static void main(String[] args) {
        AAA1 aaa = new AAA1();
        System.out.println(aaa.getResult());
        AAA1 aaab = new BBB1();
        System.out.println(aaab.getResult());
        //调用哪个方法 动态绑定机制
        //成员方法在执行的过程中，jvm会将方法和当前调用实际内存进行绑定
        //属性没有动态绑定机制，属性哪里声明就哪里使用
    }
}
class AAA1{
    public int i=10;
    public int getResult(){
        return i + 10;
    }
}

class BBB1 extends AAA1{
      public int i=20;
//    public int getResult(){
//        return i + 20;
//    }
}