object Meancalculater {

  def meanoftwonumbers(n: Int, m: Int): Double = (n + m) / 2.0


  def main(args: Array[String]): Unit = {
    print("Enter first number : ");
    val n = scala.io.StdIn.readInt();
    print("Enter second number : ");
    val m = scala.io.StdIn.readInt();

    val result = meanoftwonumbers(n, m);
    println(f"The mean of $n and $m is $result%.2f")
  }
}
