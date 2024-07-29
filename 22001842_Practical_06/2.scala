import scala.io.StdIn
object app2{
    
//get student infomations
    def getStudentInfo(): (String,Int,Int)={
        var isValid = false
         var name = ""
         var marks = 0
         var totalPossibleMarks = 0

        while (!isValid) {
         print("\nEnter student name: ")
         name = StdIn.readLine()
         print("Enter marks obtained: ")
         marks = StdIn.readInt()
         print("Enter total possible marks: ")
         totalPossibleMarks = StdIn.readInt()
         val (valid, errorMessage) = validateInput(name, marks, totalPossibleMarks)
         if (valid) {
             isValid = true
         } else {
             println(s"Error: ${errorMessage.getOrElse("Invalid input")}. Please try again.")
         }
    }
        (name, marks, totalPossibleMarks)
    }

// print students recods
    def printStudentRecord( recods:(String,Int,Int,Double,Char) ): Unit ={
        val (name, marks, totalPossibleMarks, percentage, grade) = recods
        println(s"\nName: $name")
        println(s"Marks obtained: $marks")
        println(s"Total possible marks: $totalPossibleMarks")
        println(s"Percentage: $percentage%")
        println(s"Grade: $grade")
    }

//function to valid input
    def validateInput(name:String,marks:Int,totalPossibleMarks:Int):(Boolean,Option[String])={
        if(name.isEmpty){
            (false,Some("Name cannot be empty"))
        }else if(marks<0 || totalPossibleMarks<=0 || marks>totalPossibleMarks){
            (false,Some("Marks must be positive and not exceed total possible marks"))
        }else{
            (true,None)
        }
    }

// Function getStudentInfoWithRetry
    def getStudentInfoWithRetry() : (String, Int, Int, Double, Char) ={
         
        val (name,marks,totalPossibleMarks) = getStudentInfo();

        val percentage: Double = (marks.toDouble / totalPossibleMarks.toDouble)*100

        val grade: Char = percentage match{
            case x if x>=90 => 'A'
            case x if x>=75 && x<90 => 'B'
            case x if x>=50 && x<75 => 'C'
            case x if x<50 => 'D'
        }

         (name,marks,totalPossibleMarks, percentage, grade)
    }

    //main function
    def main(args: Array[String]): Unit = {
    
    print("How many students will be added : ")
    val n = StdIn.readInt();
    val studentsrecord = for (i <- 1 to n) yield getStudentInfoWithRetry()
    println("\nStudent Records:")
    studentsrecord.foreach(printStudentRecord)
    }
}