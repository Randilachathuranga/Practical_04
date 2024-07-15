object app{
  
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

    def main(args: Array[String]): Unit = {
        //a
        println(-(-b) * a + c * d - (-c))

        //b
        println({a += 1; a})

        //c
        val g: Float = 3.0f
        println(-2 * (g - k) + c)

        //d
        println ({c += 1; c});

        //e
        print({c += 1 ; a+=1; c * a})

    }
}