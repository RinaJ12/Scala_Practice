package learning.scala

object RepeatedWords {
  def main(args: Array[String]): Unit = {
    val l1,temp1 = "abcdecamnd"
    var count=0;
     var temp2="";
     var result = ""
    for(i1<- 0 to l1.size-1)
    {   
      val inter = l1(i1)
      var counter2=0
      for(i2<- 0 to temp1.size-1)
      {
        if(inter.equals(temp2(i2))) counter2+=1
      }
      if(counter2>=2) 
        result=result+inter
      else
        temp2=temp2+inter      
    }
     
     println("Repeated characters")
     result.toSet.foreach(print)
     println()
     println(temp2)
  }
}