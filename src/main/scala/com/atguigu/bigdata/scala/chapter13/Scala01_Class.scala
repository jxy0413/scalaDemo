package com.atguigu.bigdata.scala.chapter13

object Scala01_Class {
  def main(args: Array[String]): Unit = {
      test[Child](new Child)
  }
  //<:表示泛型的上限，所以传递数据时，应该为子类或者当前类
  //>:表示泛型的下限，所以传递数据时，应该为父类或者当前类，所以传递数据的时候什么都可以传
  def test[T <: User](t:T): Unit ={
     println(t)
  }
}
class Person{

}
class User extends Person{

}
class Child extends User{

}