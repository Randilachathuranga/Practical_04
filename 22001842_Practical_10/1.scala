object O1{
    class Rational(numerator: Int, denominator: Int) {
        require(denominator != 0, "Denominator cannot be zero.")
        def unary_- : Rational = new Rational(-numerator, denominator)

        def printRational(): Unit = {
            println(s"$numerator/$denominator")
        }
    }

    def main(args: Array[String]): Unit = {
        val x = new Rational(3, 4)
        x.printRational()    
        val y = -x     
        y.printRational()
    }
}