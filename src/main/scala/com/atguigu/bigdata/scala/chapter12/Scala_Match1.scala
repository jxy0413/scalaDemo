package com.atguigu.bigdata.scala.chapter12

object Scala_Match1 {
  def main(args: Array[String]): Unit = {
      for(ch <- "+-3!"){
         var sign = 0
         var digit= 0
         ch match {
           case _ => sign = 6
           case '+' => sign = 4
           case _ if ch.toString.equals("3") => digit =3
         }
        println(ch+" "+sign+" "+digit)
     }
  }
}
