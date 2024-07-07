object secondapp {

  def PatternMatching(number: Int): Unit = number match {
    case x if x <= 0     => println("The number is Negative or zero")
    case x if x % 2 == 0 => println("The number is even")
    case _x => println("The number is odd")
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    var number = scala.io.StdIn.readInt()

    PatternMatching(number)
  }
}
