object lists {

  def filterStrings(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    print("How many strings will be added: ")
    val number = scala.io.StdIn.readInt()

    var mylist: List[String] = List()

    for (i <- 1 to number) {
      print("Enter a string: ")
      val string = scala.io.StdIn.readLine()
      mylist = mylist :+ string
    }

    println("Filtered strings with length greater than 5:")
    val filteredList = filterStrings(mylist)
    println(filteredList.mkString(" , "));
  }
}
