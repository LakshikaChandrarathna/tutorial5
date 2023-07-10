object Q6 {
  def main(args: Array[String]): Unit = {
    def fibonacci(number: Int): Int = number match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(number - 1) + fibonacci(number - 2)
    }

    def fibonacciSequence(number: Int): Unit = {
      if (number > 0) {
        fibonacciSequence(number - 1)
        println(fibonacci(number))
      }
    }

    fibonacciSequence(10)
  }
}
