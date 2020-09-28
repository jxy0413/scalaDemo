package com.atguigu.bigdata.scala.chapter02

object ScalaDataType {
  def main(args: Array[String]): Unit = {
        val i:Int =10
        val d = i.toDouble
        println(d)
        println(Unit)
    def f1():Nothing = {
        throw new Exception
    }
//      val i1:Int = null
//      println(i1)
       val s : String = "123"
       println(s.toInt)
       val s1 : String = "12.5"
       println(s1.toDouble)
       //scala中的下划线有特殊的用途，不能独立的使用

  }
}
