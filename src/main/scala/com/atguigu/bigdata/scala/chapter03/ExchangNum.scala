package com.atguigu.bigdata.scala.chapter03

object ExchangNum {
  /**
   * 两个数的交换
   * @param args
   */
  def main(args: Array[String]): Unit = {
       var a = 1
       var b = 2
       println("a="+a)
       println("b="+b)
       a = a+b
       b = a - b
       a = a - b
       println("反转后：")
       println("a="+a)
       println("b="+b)
       //位运算
       a = a^b
       b = a^b
       a = a^b
       println("再反转后：")
       println("a="+a)
       println("b="+b)
  }
}
