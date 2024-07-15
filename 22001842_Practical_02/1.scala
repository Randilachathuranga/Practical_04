object EXP {
  var i, j, k = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'

  def main(args: Array[String]): Unit = {
    
    var exprA = k + 12 * m
    var exprB = m / j
    var exprC = n % j
    var exprD = m / j * j
    var exprE = f + 10 * 5 + g
    i += 1
    var exprF = i * n

    println(s"a) k + 12 * m = $exprA")
    println(s"b) m / j = $exprB")
    println(s"c) n % j = $exprC")
    println(s"d) m / j * j = $exprD")
    println(s"e) f + 10*5 + g = $exprE")
    println(s"f) ++i * n = $exprF")
  }
}
