package com.atguigu.bigdata.scala.chapter10

object Scala_Method {
  def main(args: Array[String]): Unit = {
    //集合常用的方法
    var list = List(2,3,4,1,3,4,11)
    println("sum = " + list.sum)
    println("max = " + list.max)
    println("min = " + list.min)
    println("product = " + list.product)
    //反转  无排序
    println("revserse = " + list.reverse)
    //分组
    val intToInts = list.groupBy(x => x)
    val StringList = List("11","22","23","44","45")
    intToInts.foreach(t=>{println(t._1+"="+t._2)})
    val stringToStrings = StringList.groupBy(s=>{s.substring(0,1)})
    stringToStrings.foreach(t=>{println(t._1+"="+t._2)})

    val intToInts1 = list.groupBy(i=>{i%2})
    intToInts1.foreach(t=>println(t._1+"="+t._2))
    //根据什么排序
    val intSort = list.sortBy(x=>x)
    println(intSort.mkString(","))
    val strings = StringList.sortBy(x=>{x.substring(1)})
    println(strings.mkString(","))
    //sortWith排序
    val ints = list.sortWith((x,y) =>{x>y})
    println(ints.mkString(","))
    val strings1 = StringList.sortWith((x,y)=>{x.substring(1)>y.substring(1)})
    println(strings1)
    //迭代
    for (elem <- list.iterator) {
      println(elem)
    }
    //map映射
    //映射成元组
    val tuples = list.map(x =>(x,1))
    val intToTuples = tuples.groupBy(t=>t._1)
    val intToInt = intToTuples.map(t=>(t._1,t._2.size))
    println(intToInt.mkString(","))
    val ints1 = list.take(1)
    //取前1个
    println(ints1)
  }
}
