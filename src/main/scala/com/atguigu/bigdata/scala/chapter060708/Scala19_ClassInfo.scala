package com.atguigu.bigdata.scala.chapter060708

object Scala19_ClassInfo {
  def main(args: Array[String]): Unit = {
     //todo Scala想要获取类的信息，需要采取特殊的方法
     val userClass = classOf[User19]
     //classOf能直接使用，需要采用特殊的方法:classOf
     type XXX = User19
     //可以使用type关键字给类起别名
     val xxx = new XXX
     println(xxx)

     val user = new User19
     val bool = user.isInstanceOf[User19]
     //判断类型
     if(bool){
 //         val user1 = bool.asInstanceOf[User19]
          //转换类型
 //         println(user1)
     }
  }
}
class User19{

}