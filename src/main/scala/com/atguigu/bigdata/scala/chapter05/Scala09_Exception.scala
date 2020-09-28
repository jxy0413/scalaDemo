package com.atguigu.bigdata.scala.chapter05

object Scala09_Exception {
  def main(args: Array[String]): Unit = {
    try{
        var i = 10
        var j = 0
        var k = i/j

    }catch {
      case ex: Exception => println("捕获异常")
      case ex: ArithmeticException => println("数字异常")
    }finally {
      println("finally....")
    }
  }
}
