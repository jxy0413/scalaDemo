package com.atguigu.bigdata.scala.chapter05

object Scala05_RecursionFunction {
  def main(args: Array[String]): Unit = {
    //递归 1）函数调用时候有规律
    //     2)跳出逻辑
    // 3）递归函数无法推断出返回值类型，必须要声明
    //阶乘
    def recusion(i:Int): Int ={
         if(i==1){
           1  //返回1
         }else{
           i * recusion(i-1) //??? 不知道类型
         }
    }
    println(recusion(5))
  }
}
