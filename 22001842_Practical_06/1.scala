object InventorySystem {

    type Inventory = Map[Int, (String, Int, Double)]

    val inventory1: Inventory = Map(
      101 -> ("ProductA", 10, 5.99),
      102 -> ("ProductB", 20, 3.49),
      103 -> ("ProductC", 5, 15.99)
    )

    val inventory2: Inventory = Map(
      102 -> ("ProductB", 30, 3.99),
      104 -> ("ProductD", 25, 7.99),
      105 -> ("ProductE", 15, 9.99)
    )

    //Retrieve all product
    def retrieveProductNames(inventory: Inventory): Iterable[String] = {
      inventory.values.map(_._1)
    }

    //Calculate the total value of all products
    def calculateTotalValue(inventory: Inventory): Double = {
      inventory.values.map {
         case (_, quantity, price) => quantity * price
       }.sum
    }

    //Check if inventory is empty
    def isInventoryEmpty(inventory: Inventory): Unit = {
      val emp = inventory.isEmpty
       if(emp) println("Inventory is empty") else println("Inventory is not empty")
    }

    //Merge inventories
    def mergeInventories(inventory1: Inventory, inventory2: Inventory): Inventory = {
      inventory2.foldLeft(inventory1) { case (acc, (id, (name, quantity, price))) =>
        acc.get(id) match {
          case Some((existingName, existingQuantity, existingPrice)) =>
            acc.updated(id, (existingName, existingQuantity + quantity, math.max(existingPrice, price)))
          case None =>
            acc + (id -> (name, quantity, price))
        }
      }
    }

    //Check if a product with a specific ID exists and print its details
    def checkProductExistence(inventory: Inventory, productId: Int): Unit = {
      inventory.get(productId) match {
        case Some((name, quantity, price)) =>
          println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
        case None =>
          println(s"Product ID: $productId does not exist in the inventory.")
      }
    }


    def main(args: Array[String]): Unit = {

  

    // Perform the operations
    println("Retrieve all product names")
    println(retrieveProductNames(inventory1))

    println("\nCalculate the total value of all products")
    println(calculateTotalValue(inventory1))

    println("\nCheck if inventory is empty:")
    println(isInventoryEmpty(inventory1))

    println("\nMerge inventory1 and inventory2:")
    val mergedInventory = mergeInventories(inventory1, inventory2)
    println(mergedInventory)

    println("\nCheck if product with ID 102 exists and print its details:")
    checkProductExistence(inventory1, 102)
  }
}
