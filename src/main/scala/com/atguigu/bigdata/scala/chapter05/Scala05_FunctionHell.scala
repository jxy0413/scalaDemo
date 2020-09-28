package com.atguigu.bigdata.scala.chapter05

object Scala05_FunctionHell {
  def main(args: Array[String]): Unit = {
//     //函数式编程 -地狱
//     //todo Scala是完全面向函数式编程语言
//     //函数再Scala中可以做任何事情
//     //函数可以赋值给变量
//     //函数可以作为函数的参数的参数
//     def f() ={
//        println("funcation")
//     }
//
//     def f0()={
//       //返回函数
//       //直接返回函数、有问题、需要增加特殊符号
//         f _
//     }
//
//     f0()()
//
//    /**
//     * 简化版
//     * 一个函数再实现逻辑时候，将外部的变量引入到函数的内容，改变了这个生命周期，叫做闭包
//     */
//     def f1(i:Int) = {
//         def f2(j:Int) :Int = {
//            i * j
//         }
//        f2 _
//     }
//    println(f1(2)(3))
//
//    //函数的柯里化
//    def f3(i:Int)(j:Int) : Int = {
//        i * j
//    }
//
//    println(f3(2)(3))
//
//    //将函数作为参数传递给另一个函数，需要采用特殊的声明方式
//    //() => unit
//    def f4(f5:() => Int) = {
//          f5() + 10
//    }
//    def f5() = {
//        5
//    }
//    println(f4(f5))
//
//    //使用匿名函数来改善
//    def f6(f7 : () => Unit) = {
//       f7()
//    }
//    f6(()=>{
//      println("XXXXXXXXXXXXXXXXXXXX")
//    })
//
//    def f8(f:(Int)=>Unit)={
//       f(10)
//    }
//    def f9(i:Int) ={
//      println(i)
//    }
//
//    f8(f9)
//
//    //匿名函数
//    def f10(i:Int,j:Int) : Int = {
//       i+j
//    }
     def f7(f:(Int,Int) => Int) :Int = {
             f(10, 10)
     }

    def f8 (i:Int,j:Int) : Int = {
      i+j
    }

    println(f7((x,y)=>{x+y}))

    println(f7(_+_))
  }
}
