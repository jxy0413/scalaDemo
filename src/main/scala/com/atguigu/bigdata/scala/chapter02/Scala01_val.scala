package com.atguigu.bigdata.scala.chapter02

object Scala01_val {
  def main(args: Array[String]): Unit = {
     //声明变量
     //var 变量名称:变量类型 = "变量的值"
     //var name : String = "zhangsan";
     //java局部变量
     //scala必须显示的初始化
     var age : Int  = 10
     age = 20
     //var c : Char = 'C'
     //var b : Boolean = false
     val name = "lisi"
     //使用var声明的变量的值可以修改的
     //使用val生命的变量的值无法修改
     var s = "123"+"abc"
     println(s)
     //标识符
     val ++ = "123"
     println(++)
     //scala中可以使用特殊符号作为标识符，其实特殊符号在编译的时候进行了转换
  }
}
