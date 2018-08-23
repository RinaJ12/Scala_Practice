
package learning.scala
object Options {
  
  def toInt(s:String):Option[Int]= {
    try
    {
      Some(Integer.parseInt(s))
    }
    catch{
      case e:Exception =>None
    }
  }
  def main(args: Array[String]): Unit = {
    
    try{
    println(toInt("100").getOrElse(0))
    println(toInt("Nisha").orElse(Some(10)).getOrElse(0))
    println(toInt("33333").getOrElse(0))
    //val a:List[Any] =  List("1","2","pqr","1","10","okay","10.005")
    val a:List[Any] =  List(1,2,"pqr",1,10,"okay",10.005,'p')
    a.foreach(rec=> {
      /*val temp = toInt(rec).getOrElse(0)
      temp match
      {
      case Some(temp)=>println(s"toInt returns $rec")
      case None=>println(s"toInt returns None!!")
      }*/
      rec match{
        case rec:Int => println(s"Number $rec")
        case rec:String => println(s"String $rec") 
        case oops => println(s"its default: $oops")
        
      }
    }
    )
    
    /*println(a.flatMap(toInt))
    a.map(toInt).collect{case(i)=>i}
    Try(1/0) match {
      case Success(i)=>println(s"Sucess $i")
      case Failure(i)=>println(s"Failuer $i")
    }
    toInt("hhh111").foreach{rec=>println(s"in foreach = $rec")}*/
    
  }
    catch
    {
      case ex:Exception => println("cannot extract value from None!")
    }
  }
}