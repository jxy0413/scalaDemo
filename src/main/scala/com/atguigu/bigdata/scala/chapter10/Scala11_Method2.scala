package com.atguigu.bigdata.scala.chapter10

object Scala11_Method2 {
  def main(args: Array[String]): Unit = {
    //reduce
    val list = List(1,2,3,4)
    //数据减少，不是结果变少
    val i = list.reduce(_+_)
    //reduceRight就是reversed reduceLeft 在交换
    list.reduceRight(_+_)
    println(i)
  }
}
