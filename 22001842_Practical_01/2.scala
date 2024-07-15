
object Fahrenheitcal {
    
    def convert(temp : Double) : Double ={
        temp * 1.8 + 32;
     }

//main 
    def main(args: Array[String]): Unit = {
    
    val celsiusTemperature = 35.0
    val fahrenheit = convert(celsiusTemperature);
    println();
    println("Fahrenheit is : " + fahrenheit + "'F");
    println();
    
   
  }
}