package com.atguigu.bigdata.scala.chapter09

object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {
       implicit def transform(mysql: Mysql) : Operate = {
               new Operate
       }
       val mysql = new Mysql
       mysql.select()
       mysql.delete()
  }
}
class Mysql {
  def select() : Unit={

  }
}
class Operate{
  def delete() : Unit = {

  }
}