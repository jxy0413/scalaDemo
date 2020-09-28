package com.atguigu.bigdata.scala.chapter060708
//父类的构造方法
/*
  class A{
  }
  class B extends A{
     public B(){
     }
  }
 */
object Scala_Class1 {
  def main(args: Array[String]): Unit = {
        val user  = new User11()
  }
}
class Person1(s:String){
    println("Person的主构造方法"+s)
}
//如果父类的主构造方法有参数，那么必须构建时候显示传递参数
class User11(s:String) extends Person1(s){
    println("User的主构造方法")
    def this(){
      this("xxxxx")
      println("user的辅助构造方法")
    }
}
