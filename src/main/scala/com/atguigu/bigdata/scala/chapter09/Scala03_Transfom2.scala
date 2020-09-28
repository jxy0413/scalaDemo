package com.atguigu.bigdata.scala.chapter09

object Scala03_Transfom2 {
  def main(args: Array[String]): Unit = {
    //implicit val username : String = "wangwu"
    implicit val age : Int = 12
    def test(implicit hello:String = "zhangsan") : Unit = {
      println("hello  "+ hello)
    }
    test()//方法调用时候，使用小括号会导致隐式值无法传递
    //方法调用时候，可以不适用隐式值
//    def test1(implicit hello:String ) : Unit = {
//      println("hello  "+ hello)
//    }
//    test1//会直接发生错误
  }
}
