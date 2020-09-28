package com.atguigu.bigdata.scala.chapter10

object WordCount {
  def main(args: Array[String]): Unit = {
      val lineList = List(("Hello Scala world",4),("Hello spark",2),("Hadoop hbase",2))
      //将我们一行的数据拆分成一个个的单词
      //("Hello Scala World",4) ==> (hello,4),(Scala,4)
    val flatMapList = lineList.flatMap(t => {
      val line = t._1
      val words = line.split(" ")
      words.map(w => (w, t._2))
    })
    //将单词进行分组
    val stringToTuples = flatMapList.groupBy(t=>t._1)
    //求和Hello -> List((Hello,4), (Hello,2))
    val stringToInt = stringToTuples.map(t => {
      val ints = t._2.map(tt => tt._2)
      (t._1, ints.sum)
    })
    val tuples = stringToInt.toList.sortWith((r,l)=>(r._2>l._2)).take(3)
    println(tuples)
  }
}
