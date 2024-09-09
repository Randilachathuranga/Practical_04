object O2{
    class Rational(val numerator: Int, val denominator: Int) {
        require(denominator != 0, "Denominator cannot be zero.")

        def sub(that: Rational): Rational = {
            val newNumerator = (this.numerator * that.denominator) - (that.numerator * this.denominator)
            val newDenominator = this.denominator * that.denominator
            new Rational(newNumerator, newDenominator).simplify
        }

        private def simplify: Rational = {
            val gcd = greatestCommonDivisor(numerator, denominator)
            new Rational(numerator / gcd, denominator / gcd)
        }

        private def greatestCommonDivisor(a: Int, b: Int): Int = {
            if (b == 0) a else greatestCommonDivisor(b, a % b)
        }

        def printRational(): Unit = {
            println(s"$numerator/$denominator")
        }
    }
    def main(args: Array[String]):Unit={
        val x = new Rational(3, 4)
        val y = new Rational(5, 8)
        val z = new Rational(2, 7)

        val result = y.sub(z)
        result.printRational()
    }
}