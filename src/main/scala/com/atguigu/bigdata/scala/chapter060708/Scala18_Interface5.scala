package com.atguigu.bigdata.scala.chapter060708

object Scala18_Interface5 {
  def main(args: Array[String]): Unit = {
       val mysql = new Mysql18
       println(mysql)
  }
}
trait Operate19{
    //特质的适用范围
    this : Exception =>
    def insert(): Unit ={
       println("插入数据")
       this.getMessage
    }
}
class Mysql18 extends Exception with Operate19{

}