import java.lang.Math

object areacalculater {

  def Area(radius : Double) : Double ={
    val pi = Math.PI;
    return pi*radius*radius;
  }

//main 
  def main(args: Array[String]): Unit = {
 
  val rad = 5.0;
  val value = Area(rad);

  println();
  println("Area of a disk : " + value)
  println();
   
  }
}
