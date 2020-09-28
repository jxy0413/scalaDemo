package com.atguigu.bigdata.scala.chapter03

import scala.io.StdIn

object Readline_Oper {
  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine()
    println("line = "+line)
  }
}
