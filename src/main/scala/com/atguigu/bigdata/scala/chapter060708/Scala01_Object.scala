package com.atguigu.bigdata.scala.chapter060708
//面向对象
//todo scala是一个完全面向对象的语言
/*
  puckage com.test.xxx
  import java.util.HashMap
  public class User{

  }
 */
object Scala01_Object {
  def main(args: Array[String]): Unit = {
       //创建类的对象
       val user : User = new User()
       //调用对象的属性和方法
       user.username = "zhangsan"
       user.age = 12
       println(user.username)
  }
}
//声明类
class User{
     //声明属性
     var username : String = _

     var age : Int = 0

     def login() = {
        true
     }
}