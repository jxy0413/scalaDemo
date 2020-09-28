package com.atguigu.bigdata.scala.chapter04

object Scala_Process1 {
  def main(args: Array[String]): Unit = {
       var x = 4
       var y = 1
       if(x>2){
         if(y>2)
            println(x+y)
            println("atguigu")
       }else
         println(x)
  }

  //todo 使用if else来模拟三元运算符
  val flg = true
  val s = if(flg) "a" else "b"
}
