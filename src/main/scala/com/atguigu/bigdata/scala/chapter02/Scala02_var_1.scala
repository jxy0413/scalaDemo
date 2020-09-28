package com.atguigu.bigdata.scala.chapter02

object Scala02_var_1 {
  def main(args: Array[String]): Unit = {
       //能省则省 可以自动的推断
       val username:String = "zhangsan"
       println(username)
       val name = "lisi"
//     name = true;
       println(name)

       val dog = new Dog()
       dog.name = "xxx"
       println(dog.name)
  }
}
class Dog{
     var name : String = ""
}