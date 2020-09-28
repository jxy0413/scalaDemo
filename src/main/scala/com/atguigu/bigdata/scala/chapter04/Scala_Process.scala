package com.atguigu.bigdata.scala.chapter04

object Scala_Process {
  def main(args: Array[String]): Unit = {
    //流程控制
    //单分支
    val falg = true
    if(falg){
        println("true")
    }
    //双分支
    if(!falg){
      println("true")
    }else{
      println("false")
    }
    //多分支
    val s = "a"
    if("a".equals(s)){
      println("aaa")
    }else if(s=="b"){
      println("bbb")
    }else{
      println("ccc")
    }
  }
}
