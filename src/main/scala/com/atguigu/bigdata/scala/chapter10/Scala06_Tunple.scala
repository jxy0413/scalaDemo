package com.atguigu.bigdata.scala.chapter10

object Scala06_Tunple {
  def main(args: Array[String]): Unit = {
      //将无关的数据当成一个整体来使用
      val tuple = ("zhangsan",1111,"xxxxx")
      //访问tuple中的数据 _顺序号
      println(tuple._1)
      println(tuple._2)
      println(tuple._3)
      println("*****************************************")
      //循环遍历
      for(elem <- tuple.productIterator){
          println(elem)
      }
      //
      val value = (1,"zhangdan")
      //如果元组中只有2个的话 称之为对偶，类似于map中的键值对
      val inttoMap = Map((1,"zhangsan"),(2,"lisi"))
      println(inttoMap)
      //
      inttoMap.foreach(t=>{println(t)})
      inttoMap.foreach(t=>{println(t._1+"="+t._2)})

  }
}
class User{
  var username : String  = _
  var age : Int = _
}
