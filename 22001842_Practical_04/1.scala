object app {
  // display list
  def displaylist(arr1: Array[String], arr2: Array[Int]): Unit = {
    if (arr1.length == arr2.length) {
      for (i <- 0 to arr1.length - 1) {
        println("Item name : " + arr1(i) + " ->-> quantity : " + arr2(i));
      }
    } else {
      println("Array length is not equal");
    }
  }
  // add quantity
  def addQuantity(
      arr1: Array[String],
      arr2: Array[Int],
      name: String,
      quantity: Int
  ): Unit = {
    var index = arr1.indexOf(name);
    if (arr1.length == arr2.length) {
      if (index < 0) println(s"The ${name} doesn't exist")
      else {
        arr2(index) += quantity;
        println(s"Restocked $quantity of '$name'. New quantity: ${arr2(index)}")
      }
    }
  }
  // takes an item
  def takesanitem(
      arr1: Array[String],
      arr2: Array[Int],
      name: String,
      quantity: Int
  ): Unit = {
    var index = arr1.indexOf(name);
    if (arr1.length == arr2.length) {
      if (index < 0) println(s"The ${name} doesn't exist")
      else {
        if (arr2(index) < quantity) {
          println(
            s"Error: Not enough quantity of '$name' to sell. Available quantity: ${arr2(index)}"
          )
        } else {
          arr2(index) -= quantity;
          println(
            s"Sold $quantity of '$name'. Remaining quantity: ${arr2(index)}"
          )

        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var itemname = Array("apple", "banana", "orange", "grapes", "mango");
    var itemquantity = Array(5, 5, 4, 3, 5);
    displaylist(itemname, itemquantity);
    addQuantity(itemname, itemquantity, "apple", 3);
    takesanitem(itemname, itemquantity, "apple", 4);
  }
}
