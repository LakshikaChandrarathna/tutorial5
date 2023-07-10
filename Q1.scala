object Q1 {
  def main(args: Array[String]): Unit = {
    def isPrime(n: Int, i: Int): Boolean = {
      if (i == 1) {
        return true
      } else {
        if (n % i == 0) {
          return false
        } else {
          return isPrime(n, i - 1)
        }
      }
    }

    println(isPrime(5, 5 / 2))
    println(isPrime(8, 8 / 2))
  }
}
