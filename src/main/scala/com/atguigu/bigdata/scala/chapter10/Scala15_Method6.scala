package com.atguigu.bigdata.scala.chapter10

object Scala15_Method6 {
  def main(args: Array[String]): Unit = {
    val result = (0 to 100).map{case _ => Thread.currentThread().getName}
    val result1 = (0 to 100).par.map{case _ => Thread.currentThread().getName}
    println(result)
    println(result1)
  }
}
