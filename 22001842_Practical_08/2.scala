object second {

    val isMultipleOfBoth: Int => Boolean = n => n % 3 == 0 && n % 5 == 0
    val isMultipleOfThree: Int => Boolean = n => n % 3 == 0
    val isMultipleOfFive: Int => Boolean = n => n % 5 == 0

    def NumberCategorizer(n: Int): String = {
        n match {
            case n if isMultipleOfBoth(n) => "Multiple of Both Three and Five"
            case n if isMultipleOfThree(n) => "Multiple of Three"
            case n if isMultipleOfFive(n) => "Multiple of Five"
            case _ => "Not a Multiple of Three or Five"
        }
    }

    def main(args: Array[String]): Unit = {
        print("Please provide exactly one integer input: ")
        val number = scala.io.StdIn.readInt()

        println(NumberCategorizer(number))
    }
}