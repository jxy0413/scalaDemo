package com.atguigu.bigdata.scala.chapter060708

object Scala10_Class {
  def main(args: Array[String]): Unit = {
       val user = new User10()
       user.test()
       user.test1()
  }
}
//声明类
//父类继承
//类可以声明为抽象的 abstract
abstract class Person{
   var name : String = _
   //scala中属性也可以重写，因为属性可以抽象
   //抽象属性在编译class文件时，不产生属性，不用abstract关键字声明
   var sex :String
   //声明抽象方法，方法只有声明。没有实现 不需要关键字声明
   def test()
   def test1() : Unit = {
     println("parent test1....")
   }
}

class User10 extends Person{
  //重写抽样方法：补全方法
  override def test(): Unit = {
    println("xxxx")
  }
  //todo 如果子类重写方法不是抽象，需要添加override关键字
  override def test1() : Unit = {
      println("child test1....")
  }

  override var sex: String = _
}