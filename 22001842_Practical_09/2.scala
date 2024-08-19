object NumberPatternMatching {

  val checkNumber = (n: Int) => n match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

  def main(args: Array[String]): Unit = {
    print("Please provide exactly one integer input: ")
    val input = scala.io.StdIn.readInt()

    println(checkNumber(input))
  }
}
