object Q4 {
  def main(args: Array[String]): Unit = {
    println("Enter value:")
    val n=scala.io.StdIn.readInt()
    println(n + " is " + check(n))
  }

  def check(n: Int): String = {
    if (n == 0)
      "even"
    else if (n == 1)
      "odd"
    else if (n<0)
      check(-n)
    else
      check(n - 2)
  }
}
