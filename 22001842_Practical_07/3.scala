object app3 {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      var i = 3
      while (i * i <= n) {
        if (n % i == 0) return false
        i += 2
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] =
    numbers.filter(isPrime)

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterPrime(input)
    println("My list : " + input.mkString(", "))
    println("Prime numbers : " + output.mkString(", "))
  }
}
