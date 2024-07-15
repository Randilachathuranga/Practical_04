object App3 {

  def fibonacci(n: Int): Int = n match {
    case 0           => 0
    case n if n == 1 => 1
    case _           => fibonacci(n - 1) + fibonacci(n - 2);
  }

  def fibonaccisequance(n: Int): Unit = {
    if (n > 0) {
      fibonaccisequance(n - 1)
      println(fibonacci(n))
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number : ")
    var n = scala.io.StdIn.readInt()
    println("Fibonacci numbers for given "+ n);
    fibonaccisequance(n);
  }
}
