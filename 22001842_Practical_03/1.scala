object App{
    def main(args: Array[String]): Unit = {
        print("Enter a string : ");
        val string = scala.io.StdIn.readLine();
        println(string.reverse);
    }
}