object Q3 {
  def main(args:Array[String]):Unit={
    println("Enter value:")
    val n=scala.io.StdIn.readInt()
    println("Sum="+add(n))

  }
  def add(num:Int):Int={
    if(num==0)
      return 0;
      else{
      val sum=num+add(num-1)
      return sum;
    }
  }

}
