object BookCostCalculator {

  def totalWholesaleCost(copies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.40
    val discountedPrice = coverPrice * (1 - discount)
    
    val bookCost = discountedPrice * copies;
 
   val shippingCost = if(copies <= 50){
      3.0 *copies;
   }else{
        3.0 *copies + (0.75 * (copies - 50)) ;
   }
    
    return (bookCost + shippingCost)
  }

  // Main method
  def main(args: Array[String]): Unit = {
    val numberOfCopies = 60
    val totalCost = totalWholesaleCost(numberOfCopies)
    println();
    println(s"The total wholesale cost for $numberOfCopies copies is Rs. $totalCost")
    println();
    }
}


