package com.atguigu.bigdata.scala.chapter10

object Filter {
  def main(args: Array[String]): Unit = {
     val list = List(1,2,3)
     //todo 对集合的数据进行筛选，true保留 false不保留
     val ints = list.filter(x=>true)
     println(ints.mkString(","))
     val value = list.filter(x => x%2==0)
     println(value.mkString(","))
     //zip 拉链
     val list1 = List(1,2,3,7,4)
     val list2 = List(4,5,6)
     val tuples = list1.zip(list2)
     //关联后的数据形成元组
     println(tuples.mkString(","))
     //unionList合并
     val list3 = list1.union(list2)
     println(list3.mkString(","))
     //集合交集
     val list4 = list.intersect(list2)
     println(list4.mkString(","))
     //集合差集
     println(list4.diff(list3))
  }
}
