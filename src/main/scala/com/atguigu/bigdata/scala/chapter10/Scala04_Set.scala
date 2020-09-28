package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable

object Scala04_Set {
  def main(args: Array[String]): Unit = {
    //Set集合:无序，不可重复
    val set = Set(1,2,3,4,5)
    //默认Scala提供的set集合就是不可变的(immutable)
    println(set)
    //可变Set集合
    val mset = mutable.Set(1,2,3,4)
    println(mset.mkString(","))
    println( mset+11)
    //删除机会
    println(set-3)
  }
}
