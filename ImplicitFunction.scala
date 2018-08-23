package learning.scala

object ImplicitFunction {
  implicit def implFunction(s:String) = new ImplScala(s) 

def main(args: Array[String]): Unit = {
        println("name".nextChar)
        println("pbc".previousChar)
        println("FancyString".fancyPrint)
  }
}