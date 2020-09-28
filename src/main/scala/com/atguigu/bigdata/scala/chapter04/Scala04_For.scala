package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._
object Scala04_For {
  def main(args: Array[String]): Unit = {
       //todo scala for循环
       //使用1 to 5 表示从1到五 包含
       //使用1 until 5表示从1到4 不包含
       for(i <- 1 to 10){
          println("i="+i)
       }

       for(i <- Range(0,5,2)){
         println(i)
       }
       println("****************************")
       //双层循环
       for(i <- 1 to 3){
         for(j <- 1 until 3){
             println(i +"="+ j)
         }
       }

    /**
     * 九层妖塔            *
     *                   * *
     *                  * * *
     *
     *
     *
     */
      for(i <- Range(1,18,2)){
          println(" "*((18-i)/2)+"*"*i+" "*((18-i)/2))
      }

      //todo 循环守卫
      for(i<- 1 to 5 if i %2 ==0){
        //所谓首位就是增加条件判断，如果成立就进入 如果不是就跳过循环体
           println(i)
      }

      val res = for(i <- 1 to 3){
         println(s"${i}")
      }
      println(res)

      val res1 = for(i <- 1 to 3)
         yield i * 2
      println(res1)

    //中断循环
    //java采用break语法实现
    //scala中没有break关键字，但可以用对象的方法
    breakable(
      for(i <- 1 to 19){
        if(i==5){
          break()
        }
        println(i)
      }
    )
    println("循环结束")
  }
}
