package com.atguigu.bigdata.scala.chapter10

object Scala_Method5 {
  def main(args: Array[String]): Unit = {
    //List(1,2,3,4,5)
    val list = List(1,List(2,3),List(4,5))
    val list1 = list.flatMap(any => {
        if(any.isInstanceOf[List[Int]]){
           any.asInstanceOf[List[Int]]
        }else{
             List(any)
        }
    })
    println(list1)
  }
}
