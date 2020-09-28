package com.atguigu.bigdata.scala.chapter12

object Scala01_Match {
  def main(args: Array[String]): Unit = {
    //下划线：_
    //模式匹配的其他场合，系统给变量赋初始值，类似于java导包的*，可以给类起别名，隐藏类
    //代替方法的参数，可以让函数不执行
    List(List(1,2),List(3,4))
//    val list = List(List(1,2),List(3,4))
//    val flatMap = list.flatMap(m => {
//      m
//    })
//    println(flatMap)
    val list  = List("hello world","hello scala")
    val strings = list.flatMap(x => {
      x.split(" ")
    })
    println(strings)
//    val oper = '#'
//    val n1 = 20
//    val n2 = 10
//    var res = 0
//    oper match {
//      case '+' => res = n1+n2
//      case '-' => res = n1-n2
//      case _ => println("oper error")
//    }
//    println("res = "+res)
  }
   //scala中如果每一个都匹配不到，会报异常 如果不用break语句，自动中断case

}
