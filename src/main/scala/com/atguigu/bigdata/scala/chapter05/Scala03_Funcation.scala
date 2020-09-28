package com.atguigu.bigdata.scala.chapter05

object Scala03_Funcation {
  def main(args: Array[String]): Unit = {
     //scala可以自动推断功能来简化函数的声明，即使函数体有return也不起作用
     //1)函数生命时候
     def test() : Unit = {
        return "zhansan"
     }
     println(test())
     //如果将函数体最后一行代码进行返回、那么return关键字可以返回
     def test1() : String = {
      return "zhangsan"
     }
     println(test1())
     def test2() : String = {
        "zhangsan"
     }
    println(test2())
    //如果可以根据函数的最后一行代码推断
     def test3() ={
        "zhangsan"
     }
     println(test3())
    //如果函数体只有一行代码、{}可以省略
    def test4() = "zhangdan"
    println(test4())
    //如果函数体没有参数列表（）可以省略
    def test5 = "lisi"
    println(test5)
    //todo 声明函数必须要增加 def
    //如果明确函数没有返回值、那么等号可以省略、省略后、编译器不会将函数最后一行代码作为返回值
    //如果函数没有参数列表、可以省略小括号、调用时候可以加或者不加
    def test6{
      "zhangsan"
    }
    println(test6)
    //匿名函数
    () -> {println("xxxx")}
  }
}
