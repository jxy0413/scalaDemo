package com.atguigu.bigdata.scala.chapter060708

//构造方法参数
object Scala12_Class12 {
  def main(args: Array[String]): Unit = {
      val user = new User12("123")
      println(user.name)
  }
}
//var就可以了
class User12(var name:String){

}

//scala中没有接口(interface)的概念，有特质(trait)的概念，类似于接口
//声明特质
//特质可以继承的
trait TestTrait12{

}
trait TestTrait13{

}

//所以使用这个关键字
//如果类继承多个特质，采用with连接
//如果有父类 先父类 再用with写特质
class User13 extends TestTrait12 with TestTrait13 {

}
