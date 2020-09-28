package com.atguigu.bigdata.scala.chapter10

import scala.collection
import scala.collection.mutable.ListBuffer
import scala.collection.parallel.mutable

object Scala03_Sql {
  def main(args: Array[String]): Unit = {
//    //序列 Seq
//    //todo 可变集合
//    //默认scala集合都是不可变的
//    val list = List(1,2,3,4)
//    val list1 = List(5,6,7,8)
//    println(list)
//    //通过索引来获取数据
//    println(list(0))
////    val ints = list:+1
//    val ints = 1+:list
//    println(ints)
//    val list2 = list.++(list1)
//    println(list2.mkString(","))
//    val list3 = list.::(9)
//    println(list3.mkString(","))
//    val list4 = 7 :: 8 :: 9 :: list
//    println(list4.mkString(","))
//    val list5 = 9 :: list1 ::: list4
//    println(list5.mkString(","))
//    val list6 = 9 :: list5 :: list4
//    println(list6.mkString(","))
//
//    //特殊List集合 空集合
//    println(List())
//    println(Nil)
//
//    //修改
//    val ints1 = list.updated(1,5)
//    println(ints1)
//    //查询数据
//    for (elem <- list) {
//      println(elem)
//    }
//    list.drop(10)
    //todo 可变集合
//    val mlist = ListBuffer(1,2,3,4)
//    //mlist.insert()
//    //集合属性
//    println(mlist.head)
//    //除了头以外
//    println(mlist.last)
//    //尾部
//    println(mlist.tail)
//    println(mlist.init)

    //队列(默认一定可变)
    val q = collection.mutable.Queue(1,2,3,4)
    q.enqueue(5)
    println(q)
    val i = q.dequeue()
    println("i = "+ i)
    println(q)

  }
}
