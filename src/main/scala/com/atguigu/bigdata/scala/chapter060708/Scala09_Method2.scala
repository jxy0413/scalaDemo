package com.atguigu.bigdata.scala.chapter060708

//java构造方法
/*
  java中的构造方法
  class User{
      private String username;

  }
  User user = new User();
 */
//构造方法
object Scala09_Method2 {
  def main(args: Array[String]): Unit = {
     //创建对象
     var user = new User09()
     println(user)
  }
}
//todo scala的构造方法分为两类：主构造方法 & 辅助构造方法
//scala是完全面向函数的语言，所以类也是函数
//scala是完全面向函数的语言,所以类也是参数
//scala就是这个类的构造方法
//默认情况下 scala也是给类提供无参的构造方法，所以小括号可以省略
//在主构造方法中，声明的就是辅助构造方法
class User09(s:String){
    println("主构造方法")
    println(s)
    //声明辅助构造方法，方法名为this
    def this(s:String,ss : String){
      this(s)
      println("辅助构造方法2")
    }
    def this(){
    this("辅助构造方法1","xxx")
    }
}
