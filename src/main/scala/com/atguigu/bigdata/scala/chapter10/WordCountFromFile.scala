package com.atguigu.bigdata.scala.chapter10

import scala.io.Source

object WordCountFromFile {
  def main(args: Array[String]): Unit = {
    //从文件中获取数据，统计数量
    val list = Source.fromFile("in/word.txt").getLines().toList
    println(list)

  }
}
