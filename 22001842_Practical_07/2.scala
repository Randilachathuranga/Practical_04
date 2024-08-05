object app2 {
  def calculateSquare(numbers: List[Int]): List[Int] =
    numbers.map(numbers => numbers * numbers);
  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5)
    val output = calculateSquare(input)
    println("My list : " + input.view.mkString(", "))
    println("Square of numbers : " + output.view.mkString(", "))
  }
}
