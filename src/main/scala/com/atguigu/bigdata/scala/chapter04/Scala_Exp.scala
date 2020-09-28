package com.atguigu.bigdata.scala.chapter04

object Scala_Exp {
  def main(args: Array[String]): Unit = {
    //scala中所有的表达式都有值
    //成功跟失败不一样 所以要写一个公共大的 any
    val falg = false
    val res = if(falg){
           "abc"
           println("abc")
    }
    println(res)
  }
}
