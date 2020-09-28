package com.atguigu.bigdata.scala.chapter060708

//所谓的方法，就是类中的声明的函数
//类的方法
object Scala07_Method {
  def main(args: Array[String]): Unit = {
       //创建对象
       val user = new User07
       val str = user.+("xxxx")
       println(str)
       user.login()
  }
}
class User07{
   //调用方式 有区别
   def login()={

   }
   //登出
   def logout():Boolean = {
     true
   }
}