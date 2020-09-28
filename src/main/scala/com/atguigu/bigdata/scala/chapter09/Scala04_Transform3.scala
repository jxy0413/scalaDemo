package com.atguigu.bigdata.scala.chapter09

object Scala04_Transform3 {
  def main(args: Array[String]): Unit = {
     val user4 = new User4
     user4.insert()
     user4.delete()
  }
  implicit class Person4(u:User4){
    def delete(): Unit ={

    }
  }
  class User4{
    def insert(): Unit ={

    }
  }
}

