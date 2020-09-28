package com.atguigu.bigdata.scala.chapter01

object Scala01_HelloWorld {
  //自动编译后 形成了 public static void main
  //scala在编译源码时，会生成两个字节码文件，静态main方法执行另一个字节码文件中的成员main方法
  //scala是完全面向对象的语言，没有静态的语法，只能通过模拟生成静态方法
  //所以编译时候生成一个特殊的类=> 然后创建对象来调用这个main方法
  //一般情况下，将加$的类的对象，称之为“伴生对象”
  //“伴生对象”的内容，都可以通过类名访问
  //伴生对象的语法规则，使用object声明
  //public static void main(String[]args){方法体
  //scala中没有public关键字 默认所有的访问权限都是公共的
  //scala中没有void关键字，采取特殊的对象来模拟
  //scala中生命方法采用关键字def
  //java : String 参数名
  //scala: 参数名 ： 类型
  //scala中方法的声明和方法体是通过=连接到
  //scala中将方法的返回值 放在冒号后连接
  //scala能省则省
  def main(args: Array[String]): Unit = {
      println("hello world ")
  }
}
