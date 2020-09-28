package com.atguigu.bigdata.test;

import java.util.ArrayList;
import java.util.List;

public class Java10_Access {
    public static void main(String[] args) throws Exception {
          List list = new ArrayList();
          A a = new A();
          //所谓的权限就是方法的提供者和方法的调用者之间的关系
          //方法的提供者: com.atguigu.bigdata.test.A
          //方法的调用者: Java10_Access
         a.clone();

    }

    public static void test(List list){

    }
}
class A{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}