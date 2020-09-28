package com.atguigu.bigdata.scala.chapter060708

import scala.beans.BeanProperty

//类的方法
//所谓的方法，其实就是类中声明的
object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
       val range = Range(1,5)
       println(range)
       val stu = new Student
       stu.setAddress("jia")
       println(stu.getAddress)
  }
}
class Student{
  @BeanProperty var address : String = _
}