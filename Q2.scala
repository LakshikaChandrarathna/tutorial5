object Q2 {
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

    def primeSeq(n: Int): Unit = {
      if (n > 2) {
        primeSeq(n - 1)
        if (isPrime(n, n/ 2) && n != 13) {
          println(n)
        }
      } else if (n == 2) {
        println(n)
      }

    }

    primeSeq(13)
  }
}
