package com.atguigu.bigdata.test;

public class Java17_Class1 {
    public static void main(String[] args) {
        test(Person17.class);
        test(User17.class);
        test1(XXX17.class);
    }
    //extends体现类的体系树的上限
    public static void test(Class<? extends Person17> c){
        System.out.println(c);
    }
    //extends体现类的体系树的下限
    public static void test1(Class<? super Person17> c){
        System.out.println();
    }

}
class XXX17{

}
class Person17 extends XXX17{

}
class User17 extends Person17{

}
class Student17{

}