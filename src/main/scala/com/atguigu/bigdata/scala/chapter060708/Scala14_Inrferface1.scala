package com.atguigu.bigdata.scala.chapter060708

object Scala14_Inrferface1 {
  def main(args: Array[String]): Unit = {
       //java中的接口无法直接构造对象，必须使用实现类
       //java中接口可以声明属性，属性值无法修改
       //java
       //scala中特质无法构建对象
       //new TestTrait()
       //scala的特质也无法构建特质
       //scala中特质声明的属性和方法都可以混入的类中调用
       val user5 = new User55()
       println(user5.name)
       user5.name = "jia"
       println(user5.name)
  }
}
trait Test14{
    var name : String = "zhangsan"
    def test() : Unit = {
         println("test.....")
    }
    //特质中可以生命抽象方法
    def test1()
}
class Person14{

}
class User55 extends Person14 with Test14{
  override def test1(): Unit = {
     println("xxxxxx")
  }
}