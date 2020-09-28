package com.atguigu.bigdata.scala.chapter05

object Scala04_FuncationHard {
  def main(args: Array[String]): Unit = {
    //可变函数 函数式编程 -扩展
    def test(name:String *) = {
       println(name)
    }
    test("zhangsan","lisi","wangwu")
    test()
    //调用函数时候、可以传多个参数、也可一不传参数
    //todo 默认参数
    def test1(name:String,age:Int = 20): Unit = {
       println("name "+name+" age "+age)
    }

    test1("zhangsan")
    def test2(age:Int = 20,name:String): Unit = {
      println("name "+name+" age "+age)
    }
    //带名参数
    test2(name="jia")
  }
}
