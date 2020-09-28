package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable

object Scala13_Method {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a"->1,"b"->2)
    val map2 = mutable.Map("c"->2,"b"->2)
    //相同的key做累加，不用的key直接加入即可
    val stringToInt = map1.foldLeft(map2)((map, t) => {
      //map集合设置的方式 map(key)=value
      map(t._1) = map.getOrElse(t._1, 0) + t._2
      map
    })
    println(stringToInt)
  }
}
