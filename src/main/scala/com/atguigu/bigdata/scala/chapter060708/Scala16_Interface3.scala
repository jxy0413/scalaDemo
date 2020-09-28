package com.atguigu.bigdata.scala.chapter060708

object Scala16_Interface3 {
  def main(args: Array[String]): Unit = {
       val mysql = new Mysql
       println(mysql.insert)
  }
}
trait Operate{
   println("Operate......")
   def insert(): Unit ={
     print("插入数据")
   }
}
//重写父特质的方法
trait DB extends Operate{
  println("DB......")
  override def insert(): Unit = {
    print("向数据库")
    super.insert()
  }
}
//重写父特质的方法
trait File extends Operate{
  println("File......")
  override def insert(): Unit = {
    print("向文件")
    super.insert()
  }
}
//多特质混入时，代码执行顺序从左到右，如果有父特质，会优先执行
//多特质混入时，方法调用的顺序从右到左
//特质中super关键字不是指父特质，指的是上一级特质
//如果希望super指向父特质，需要增加特殊操作：super[特质]
class Mysql extends File with DB with Serializable {

}
