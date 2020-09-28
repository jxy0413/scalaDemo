package com.atguigu.bigdata.scala.chapter060708
import _root_.java.util.HashMap
//scala中如果从最开始的开始 要开始从根目录中开始 使用的是_root_开头
//scala可以导包
package java{
    package util{
        class HashMap{

        }
    }
}
object Scala05_Import1 {
  def main(args: Array[String]): Unit = {
      val map =new _root_.java.util.HashMap()
      //val map = new java.util.HashMap
      println(map)
  }
}
