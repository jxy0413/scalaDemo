package com.atguigu.bigdata.scala.chapter060708

import scala.beans.BeanProperty

object Scalao6_Field {
  def main(args: Array[String]): Unit = {
      val user = new User06
      println(user.username)
      user.username = "zhangsan"
      println(user.username)
  }
}
//todo Scala中也有4种方法权限
//public protected 缺省 private
//public 默认的访问的权限
//protected 默认的访问权限，没有关键字   只能子类访问
//private 私有访问权限 只能当前类访问
//default 包访问权限 需要采取特殊的语法规则 private[]来代替
package p1 {
    package p2{
        class UserP2{
            var name = "zhangsan"
            private var password = "123123"
            protected var email = "@xx"
            //private[p3] var address = "xxxxx"
        }
    }
    package p3{

      import com.atguigu.bigdata.scala.chapter060708.p1.p2.UserP2

      class EmpP3 extends UserP2 {
            var user = new UserP2
       }
    }
}
class User06{
    //声明属性
    //scala给类声明属性、默认是私有的 但是提供了公共的setter/getter方法
    var username : String = _

    private var age : Int = _

    //val email : String = _
    //为了和java bean规范统一，生成java中的set、get方法
    @BeanProperty var address : String = _
}