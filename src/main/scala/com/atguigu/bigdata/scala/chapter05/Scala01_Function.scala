package com.atguigu.bigdata.scala.chapter05

object Scala01_Function {
  def main(args: Array[String]): Unit = {
    //函数式编程
    //编程的范式
    //面向对象：解决问题时候，将问题拆解出一个个的小问题，分别解决
    //对象关系：继承、实现、重写、多态
    //函数式编程关心的是问题的解决方案（封装功能）
    //重点是函数的入参、出参
    //函数式编程重要的就是函数
    //java中的方法和scala中函数都可以进行功能的封装，但方法必须和类型绑定
    //声明函数
    //调用函数
    //public static void test(String s){}
    //todo scala的语法很灵活，在任意的语法中可以生命其他语法规则
    def test(s:String) : Unit = {
         //函数体
         println(s)
    }
    test("zhangsan")
  }
}
