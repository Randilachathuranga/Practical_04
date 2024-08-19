object AmoubtInterest {

//Up to 20000
  val amount1: Float => Float = n => n * 1.02f;
//Up to 200000
  val amount2: Float => Float = n => n * 1.04f;
//Up to 2000000
  val amount3: Float => Float = n => n * 1.035f;
//Above 2000000
  val amount4: Float => Float = n => n * 1.065f;

  val calculateInterest: Float => Float = amount => {
    amount match {
      case amount if amount <= 20000   => amount1(amount)
      case amount if amount <= 200000  => amount2(amount)
      case amount if amount <= 2000000 => amount3(amount)
      case _                           => amount4(amount)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Please provide exactly one float input: ")
    val amount = scala.io.StdIn.readFloat()
    print("Final Amount at end of the year : ")
    println(calculateInterest(amount))
  }
}
