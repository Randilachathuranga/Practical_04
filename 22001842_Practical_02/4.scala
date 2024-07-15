object MovieTheaterProfit {

  def calculateProfit(price: Int): Int = {
    val fixedCostPerPerformance = 500
    val costPerAttendee = 3
    val initialPrice = 15
    val initialAttendance = 120
    
    val attendance = price match {
      case `initialPrice` => initialAttendance
      case p if p < initialPrice => initialAttendance + 20
      case p if p > initialPrice => initialAttendance - 20
    }
    
    val revenue = price * attendance
    val totalCost = fixedCostPerPerformance + (attendance * costPerAttendee)
    
    revenue - totalCost
  }

  def findBestPrice(): (Int, Int) = {
    val profit1 = calculateProfit(10)
    val profit2 = calculateProfit(15)
    val profit3 = calculateProfit(20)

    val maxProfit = List(profit1, profit2, profit3) match {
      case List(p1, p2, p3) => List(p1, p2, p3).max
      case _ => 0 
    }
   
    println(s"Profit for Rs 10 ticket price: Rs $profit1")
    println(s"Profit for Rs 15 ticket price: Rs $profit2")
    println(s"Profit for Rs 20 ticket price: Rs $profit3")

    val bestPrice = List(10, 15, 20)(List(profit1, profit2, profit3).indexOf(maxProfit))

    (bestPrice, maxProfit)
  }

  def main(args: Array[String]): Unit = {
    val (bestPrice, maxProfit) = findBestPrice()
    println(s"Best ticket price for maximum profit: Rs $bestPrice")
    println(s"Maximum profit: Rs $maxProfit")
  }

}
