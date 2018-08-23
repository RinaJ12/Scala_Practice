package learning.scala

import scala.collection.mutable.ArrayBuffer
import java.util.ArrayList

object Test {
 
  override def toString():String ={
      "String is :"
    }
  
  def main(args: Array[String]): Unit = {
    var ab:ArrayBuffer[String] = ArrayBuffer("abc","def","pqr")
    println(ab)
    ab+="new"
    println(ab)
    
    var a:Array[String] = Array("str1","str2","str3")
    a.foreach(println)
    
    for(i<-a if i.endsWith("1")||i.endsWith("2"))
    {
      println(i)
    }
    
    a.foreach(rec=>println(rec+"_foreach"))
   println(Array(1,2,3,4).mkString("[",",","]"))
   
   val list:java.util.ArrayList[Int] = new java.util.ArrayList[Int]()
   list.add(1)
   list.add(2)
   list.add(3)
   list.add(4)
   list.add(5)
   list.add(6)
   
   list.forEach(println)
   
   /*************** Map *************************/
   val p1 = Map(
    "Lady in the Water"-> 3.0, 
    "Snakes on a Plane"-> 4.0,
    "You, Me and Dupree"-> 3.5
)


p1.foreach{case(rec1,rec2)=>println("key : "+rec1+", value : "+rec2)}
for(rec<-p1){
  println(rec._1+":"+rec._2)
}

/*********************** List ***********************/
val l1 = List(1,2,3,4)
val l2 = List(5,6,7,8)

println("l1:::l2")
println(l1:::l2)
println("List.Concat(l1,l2)")
println(List.concat(l1,l2))

val l3 = List.range(1,10)
println(l3.sorted)
val l4 = List.fill(3)("mno")

/*********************** String ***********************/

println("""just checking "string" with """)

  }
}