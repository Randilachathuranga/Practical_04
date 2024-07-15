object sumofnumbers {

  def sumboffthe_numbers(numbers: List[Int]): Int = {
    numbers.filter(num => num % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    var mylist: List[Int] = List();

    print("How many numbers will be added: ")
    val number = scala.io.StdIn.readInt()
    
    for (i <- 1 to number) {
      print("Enter a number: ")
      val number = scala.io.StdIn.readInt()
      mylist = mylist :+ number
    }

    val result = sumboffthe_numbers(mylist);
    println(f"The sum of the even numbers in the list $result");
  }
}
