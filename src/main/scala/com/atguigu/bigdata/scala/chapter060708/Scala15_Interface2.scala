package com.atguigu.bigdata.scala.chapter060708

object Scala15_Interface2 {
  def main(args: Array[String]): Unit = {
     new user11()
  }
}
//如果父类混入了相同的特质，那么特质的代码只会执行一遍
trait Test11{
   println("11")
}
class person11 extends Test11 {
   println("22")
}
class user11 extends person11 with Test11 {
   println("33")
}