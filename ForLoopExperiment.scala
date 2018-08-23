package learning.scala

object ForLoopExperiment {
  
  def main(args: Array[String]): Unit = {
    val l1 = List.range(1,20)
    val l2 = List.range(10,30)
    
    val result = for(t1<-l1;t2<-l2) yield (t1,t2)
   /* result = for{
      t1<-l1
      t2<-l2      
    } yield(t1,t2)
    */
    
    //result.foreach(print)  
    for((key,value)<-result if key==value)
    {
      println(key+" "+value)
    }    
    
    println()
    //First way
    for(i<- 0 to 10 if i<5) print(i)
    
    //Second way
    for{
      i<-0 to 10
      if i<5
    }print(i)
    
    println()
    
    println("aaaa".capitalize)
    
    val res = for(i<-l1)yield{
     i*2
    }
    
    val name = "Checking!!!"
    for(i<-0 until name.length())
    {
      println(s"$i is ${name(i)}")
    }
  }
}