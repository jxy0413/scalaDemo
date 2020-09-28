package com.atguigu.bigdata.scala.chapter10

object ScalaWorld {
  def main(args: Array[String]): Unit = {
    //对集合中的单词字符串出现的次数进行统计，并且按照出去的次数降序排列
    val strings = List("hello","scala","hello","World","hadoop","hbase","scala","world")
    val tuples = strings.map(x=>(x,1))
    val stringToTuples = tuples.groupBy(x=>x._1)
    val stringToInt = stringToTuples.map(t=>(t._1,t._2.size))
    val tuples1 = stringToInt.toList.sortWith((left,right)=>{left._2>right._2})
    //println(tuples1.take(3))

    val lineList = List("hello world","hello scala","hello hadoop")
    //todo 扁平化操作
    //将一个整体中的内容 拆成一个个的个体
    //List => 1,2,3
    val flatMap = lineList.flatMap(x => x.split(" "))
    println(lineList)
    val tuples2 = flatMap.groupBy(word=>word).map(t=>(t._1,t._2.size)).toList.sortWith((left,right)=>{left._2>right._2}).take(2)
    println(tuples2.mkString(","))
  }
}
