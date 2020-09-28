package com.atguigu.bigdata.test;

import java.util.ArrayList;
import java.util.List;

public class Java16_Class {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList();
        List list = new ArrayList();
        list.add(1);
        stringList.add("12");
        //所谓的泛型，其实就是对类型的约束
        String str = stringList.get(0);
        System.out.println(str);
        List<Person> personList = new ArrayList<Person>();
        //java中的泛型不变性
        personList.add(new User16()); //关联到User16了
        //泛型的作用域，对声明泛型后的逻辑操作进行类型约束，对之前的操作约束不了

    }
}
class Person{

}
class User16 extends Person{

}
class Student{

}