object Q5 {
  def main(args: Array[String]): Unit = {
    def sum(number: Int): Int = {
      if (number == 0) {
        return 0
      }
      if (number % 2 == 1) {
        return sum(number - 1)
      } else {
        return number + sum(number - 1)
      }
    }

    println(sum(15))
  }
}
