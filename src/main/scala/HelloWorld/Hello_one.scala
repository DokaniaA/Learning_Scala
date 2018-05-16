// This is try some hands on examples in Scala
package HelloWorld

object Hello_one {
  def main(args:Array[String]) {
    // val name:String = args(0)
    val name:String = "World"
    println("Hello " + name + "!!")
  }
}

//below is code to print today's date
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object PrintDate {
  def main(args: Array[String]): Unit = {
    val now =new Date
    val df = getDateInstance(LONG,Locale.US)
    println(df.format(now))
  }
}


