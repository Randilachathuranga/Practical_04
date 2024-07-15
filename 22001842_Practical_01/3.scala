import java.lang.Math

object volumncal {
    
    def volumn(r : Double) : Double ={
        val pi = Math.PI;
        return (4.0/3.0) *pi*r*r*r;
     }

//main 
    def main(args: Array[String]): Unit = {
    
    val radius = 5.0
    val vol = volumn(radius);
    println();
    println("The volume of a sphere : " + vol);
    println();
    
   
    }
}