package com.atguigu.bigdata.scala.chapter10

object Scala12_Method3 {
  def main(args: Array[String]): Unit = {
    //折叠
    val list = List(1,2,3,4)
    //fold方法可以传递2个部分的参数，第一个表示集合之外的数据
    //第二部分表示数据进行的逻辑处理
    val listsum = list.fold(100)(_+_)
    println(listsum)
    //foldLeft
    //foldRight
    //reserve 4 3 2 1       (((10-4)-3)-2)-1)
    //foldRight    (1-(2-(3-(4-10))))
    val foldRight = list.foldRight(10)(_-_)
    println(foldRight)

  }
}
