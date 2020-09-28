package com.atguigu.bigdata.scala.chapter01

//打印字符串
object Scala02_StringPrint {
  def main(args: Array[String]): Unit = {
    //打印字符串
    println("测试字符串")
    val name = "ApacheCN"
    val age = 1
    val url = "www.baidu.com"
    println("name="+name+",age="+age+",url="+url)
    println("name="+name+",age="+age+",url="+url)
    //插值字符串
    println(s"name=${name},age=${age},url=${url}")
    //raw给的是什么值就给什么值
    println(raw"name=${name},age=${age},url=${url}")
  }
}
