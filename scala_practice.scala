class TailRecursion {

def rFactorial(n:Int):Int = {

  def tFactorial(n: Int, f: Int): Int = {
    if(n<=0)
      throw new Exception("Boom !")
    else
    return tFactorial(n-1,n*f)	
  }
    return tFactorial(n,1)  
	

for (list<-List("abc","def","pqr","stu","mon")) yield {
list match {
case "abc" => "abc"+"--test"
case "def" => "def"+"--test"
case "pqr" => "pqr"+"--test"
case "stu" => "stu"+"--test"
case _ => "mon"+"--test"
 }
}

for (list<-List("abc","def","pqr","stu","mon")) {
list match {
case "abc" => println("abc"+"--test")
case "def" => println("def"+"--test")
case "pqr" => println("pqr"+"--test")
case "stu" => println("stu"+"--test")
case _ => println("mon"+"--test")
 }
}

class Circle{
private var radius:Int = 1;
println("this statamenet always gets executed at the time of object creation!!")
def this(r:Int){
this()
if(r<0) throw new Exception("radius cant be negative!")
else radius=r
}
def setRadius(rd:Int)={
if(rd<0) throw new Exception("radius cant be negative!!!")
else radius = rd
}
def getRadius():Int={
radius
}
def method():Int=radius*5000
}

val c = new Circle(100)

//Object instantiate only at first.

object ObjectTest{
println("Instantiating....")
def method1 = println("just checking instantiation of an object!!!")
}

scala> ObjectTest.method1
Instantiating....
just checking instantiation of an object!!!

scala> ObjectTest.method1
just checking instantiation of an object!!!

//Apply method - default method offered by Scala class and Object

class ObjectTest{
def apply(n:Int)=println("class level apply method is called!!")
}
object ObjectTest{
println("Instantiating....")
def method1 = println("just checking instantiation of an object!!!")
//def apply(str:String)=println("Hey Its "+str+", just learning how apply method works")
def apply(int_arg:Int)=println("Hey Its "+int_arg+", just learning how apply method works")
}

//scala interpolation

scala> println(s"$name is $age years old!!") // not typesafe as name and age are of different types
nisha is 18 years old!!

println(f"$name%s is $age%d years old!!") // type safe

double/float %f

//partitally applied functions

def func1(a:Int,b:Int)= a+b
val hof = func1(13,_:Int)
hof(100)

//closure is a function which uses the variables declared outside the function

var a = 10

val func1 = (x:Int)=>x+a // a is free variable as it is not bound to function and function does not know its value.
//closure takes last updated state of variable
//pure(val datatype) vs impure clousers(var datatype)

//Function Currying is the technique of transforming a function which takes multiple arguments into the func which takes single argument

def func1(x:Int,y:Int) = x+y // func(10,20)
def func1(x:Int)=(y:Int)=> x+y // val a = func(10); a(20) // function currying
def func1(x:Int)(y:Int) = x+y // func1(10)(20) or val a = func1(10)_ ; a(20) // function currying

output of above all fucntions wil be same.
