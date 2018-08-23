package learning.scala

class ImplScala(s:String) {
    def nextChar = s.map(c=>(c+1).toChar)
    def previousChar = s.map(c=>(c-1).toChar)
    def fancyPrint = "String is:"+s
}