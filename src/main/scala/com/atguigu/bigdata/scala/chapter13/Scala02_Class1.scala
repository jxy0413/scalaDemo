package com.atguigu.bigdata.scala.chapter13

object Scala02_Class1 {
  def main(args: Array[String]): Unit = {
      //默认情况下：scala中的泛型和java一样
      //在scala中，为了丰富泛型的功能，提供了协变(+)，逆变(-)的类型操作
      val test:Test[User1] = new Test[Child]
      println(test)
  }
}
class Person1{

}
class User1 extends Person1{

}
class Child1 extends User1{

}
class Test[+User]{

}
