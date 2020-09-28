package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable

object Scala05_Map {
  def main(args: Array[String]): Unit = {
    //hashMap.put("k","v")
    //Scala中的k-v对数据采用特殊的方式声明
    val map = Map("a" -> 1,"b" -> 2,"c" -> 3)
    val map1 = map+("d" -> 4)
    println(map1.mkString(","))

    //可变
    //val mmap = mutable.Map("a"->1,"b"->2)
    val map2 = map - ("b")
    println(map2.mkString(","))
    //修改数据
    val map3 = map.updated("b",5)
    println(map3.mkString(","))
    //循环遍历
    //Scala为了防止集合出现空指针，提供了一个特殊的类，Some,None
    //如果确实没有获取到数据，为了不出现异常，Option类提供了有默认值的方法
    println(map.get("b").get)
    println(map.get("bb").getOrElse("0"))
  }
}
