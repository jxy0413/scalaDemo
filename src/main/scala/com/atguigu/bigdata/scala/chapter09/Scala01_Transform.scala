package com.atguigu.bigdata.scala.chapter09

object Scala01_Transform {
  def main(args: Array[String]): Unit = {
    //自动转换
    //scala默认情况下支持数值类型的自动转换
    //byte->short->int->long
    //scala默认的情况下支持多态语法类型自动转换
    //child->parent->trait
    //将两个无关的类型 通过编程手段 可以让他们自动转换
    implicit def transform(d:Double):Int ={
         d.toInt
    }
    //OCP = Open Close 开闭原则
    val i : Int = 5.0
    println(i)
  }
}
