package com.atguigu.bigdata.scala.chapter060708
//面向对象
//todo Scala的包声明方式和默认java是一致的，但是有以它的使用方式
//1)同一份源码可以多次声明
//2)声明的类在最后的包中
//源码中的类所在的位置不需要和包路径相同
//2、scala中所有的语法都可以进行嵌套  packet可以使用小括号，小括号生命的类在这个包中，声明的类不在这个包中
//3、scala可以声明父包和子包、父包的类、子包可以直接访问，不需要引入、其实就是作用域的概念
//4、scala可以声明类 不能声明函数和方法
//5、scala为了弥补不足，使用了包对象的概念,可以声明对象
package test{
  package object test{
    val test = "123"
    def test1(): Unit ={

    }
  }
}

object Scala03_Package {
  def main(args: Array[String]): Unit = {
      println("zzzzzz")
  }
}
