import scala.util.{Try,Success,Failuer}
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
    println(toInt("100").get)
    println(toInt("Nisha").getOrElse(0))
    println(toInt("33333").get)
    val a:List[String] =  List("1","2","pqr","1","10","okay")
    a.foreach(rec=> {
      val temp = toInt(rec)
      temp match
      {
      case Some(temp)=>println(s"toInt returns $rec")
      case None=>println(s"toInt returns None!!")
      }
    }
    )
    
    println(a.flatMap(toInt))
    a.map(toInt).collect{case(i)=>i}
  }
    catch
    {
      case ex:Exception => println("cannot extract value from None!")
    }
  }
}