object RunningTimeCalculator {

  def totalRunningTime(distances: List[Double], paces: List[Double]): Double = {
    (distances, paces).zipped.map(_ * _).sum
  }

  // Main method
  def main(args: Array[String]): Unit = {
    val distances = List(2.0, 3.0, 2.0)
    val paces = List(8.0, 7.0, 8.0) 

    val totalTime = totalRunningTime(distances, paces)
    println()
    println("The total running time is " + totalTime + " minutes")
    println()
  }
}
