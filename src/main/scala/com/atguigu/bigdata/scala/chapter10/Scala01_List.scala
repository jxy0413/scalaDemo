package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable.ArrayBuffer

object Scala01_List {
  def main(args: Array[String]): Unit = {
       //Java中的集合：List，Set,Map
       //LinkedList ArrayList
       //List：有序，可重复
       //Set:无序，不可重复
       //HashSet TreeSet
       //Map:无需，(K-V) key可重复，value不可重复
       //Scala中的集合分为两大类：可变(mutable) & 不可变(immutable)
       //数组（不可变）
       List(1,2)
       //java中的数组 int[] ints = new int[3]
       //Scala中的数组,使用Array对象来实现，使用中括号声明数组的类型
       //scala中可以使用简单的方式来创建数组
       val ints = Array(1,2,3,4)
       //增加()访问索引
       println(ints(0))
       //数组长度
       println(ints.length)
       println(ints)
       //将数组转成字符串打印出来
       println(ints.mkString(","))
       //数组中的元素打印
       for (elem <- ints) {
           println(elem)
       }
       def printlnXXX(i : Int) : Unit = {
              printlnXXX(i)
       }
       //foreach会将数组中的每一个元素进行
       //ints.foreach(printlnXXX)
       ints.foreach((i)=>{print(i+" ")})
       ints.foreach(println)
       ints.foreach(println)
       //修改元素
       ints.update(3,5)
       println("*******************")
       ints.foreach(print)
       //增加数据
       val ints1 = ints:+(5)
       println("*******************")
       ints1.foreach(print)
       //采用方法向数组中增加新的元素，而是产生新的数组
       //可变数组
       val arrayBuffer = ArrayBuffer(1,2,3,4)
       println(arrayBuffer(3))
       arrayBuffer(3) = 10
       //循环遍历
       arrayBuffer.foreach(println)
       arrayBuffer+=(10)
       arrayBuffer.foreach(print)
       arrayBuffer.insert(1,10)
       //arrayBuffer remove
       val i : Int =arrayBuffer.remove(1)
       println("i="+i)
       arrayBuffer.remove(2,2)
       //可变数组和不可变数组的转化
       val buffer = ints.toBuffer
       val array = buffer.toArray
  }
}
