package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable.ArrayBuffer

object Scala14_ScalatoJava {
  def main(args: Array[String]): Unit = {
       val arr = ArrayBuffer("1","2","3")
       import scala.collection.JavaConversions.bufferAsJavaList
       val javaArr = new ProcessBuilder(arr)
       val strings = javaArr.command()
       println(strings)
  }
}
