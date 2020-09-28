package com.atguigu.bigdata.scala.chapter05

object Scala02_Funcation {
  def main(args: Array[String]): Unit = {
    //返回值类型
    //函数：入参（方法参数)、出参（返回值）
    //无参，无返回值
    def test():Unit = {
       println("test")
    }
    test()
    //有参数、无返回值
    //函数没有重载的概念
    //如果在同一个作用域中，函数不能同名
    def test1(s:String) : Unit={
       println(s)
    }
    test1("zhangsan")
    //有参 有返回值
    def test2(s:String) : String = {
      return s + "ssss"
    }
    val value = test2("lisi")
    println(value)
    //无参 有返回值
    def test3():String={
       return "jia"
    }
    val values = test3()
    println(values)
    //scala中没有throws关键字、如果函数中有异常、不会再声明函数时候抛出异常
  }
}
