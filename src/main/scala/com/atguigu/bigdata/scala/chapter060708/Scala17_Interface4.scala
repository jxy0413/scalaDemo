package com.atguigu.bigdata.scala.chapter060708

object Scala17_Interface4 {
  def main(args: Array[String]): Unit = {
      //动态混入
      val mysql = new Mysql17 with Operate17
      mysql.insert()
  }
}
trait Operate17{
  def insert(): Unit ={
    println("插入数据")
  }
}
class Mysql17{

}