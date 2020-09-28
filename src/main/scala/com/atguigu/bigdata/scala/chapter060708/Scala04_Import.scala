package com.atguigu.bigdata.scala.chapter060708


import java.util.{HashMap => JavaHashMap}

//import用于导入类
//import可以在任意的地方使用
//import可以导入一个包中的所有类
//import导入相同包的多个类,采用大括号进行包含处理
object Scala04_Import {
  def main(args: Array[String]): Unit = {
    val map = new JavaHashMap()
    println(map)
  }
}
