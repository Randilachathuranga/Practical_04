import scala.annotation.switch
object app1 {
  var mylist = List[String]()
  def getProduct(itemname: String): Unit = mylist = mylist :+ itemname
//Function getProductList
  def getProductList(): Unit = {
    var name = ""
    var count = 0
    while (name != "Done") {
      print("Enter the item name to add to the list or type 'Done' to exit: ")
      name = scala.io.StdIn.readLine()
      if (name != "Done") {
        if (!mylist.contains(name)) {
          getProduct(name)
          count += 1
        } else {
          println(
            s"Item '$name' is already in the list and will not be added again."
          )
        }
      }
    }
    println(count + " Products are added");
  }

  // Function printProductList
  def printProductList(list: List[String]): Unit = {
    println("Accepts a List of product names")
    mylist.foreach(println);
  }

  // Function getTotalProducts
  def getTotalProducts(list: List[String]): Unit = {
    println("Total number of products in the list is : " + mylist.length)

  }

  def main(args: Array[String]): Unit = {
    var input = ""
    while (input != "4") {
      println();
      print(
        """Welcome to the inventory management system
          |1. Add products
          |2. Print product list
          |3. Get total number of products
          |4. Exit
          |Please enter your choice: """
      )

      input = scala.io.StdIn.readLine()
      println();
      input match {
        case "1" => getProductList()
        case "2" => printProductList(mylist)
        case "3" => getTotalProducts(mylist)
        case "4" => println("Exiting the system...")
        case _   => println("Invalid choice. Please enter 1, 2, 3, or 4.")
      }
    }
  }
}
