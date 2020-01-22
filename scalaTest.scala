import scala.io.Source
import scala.collection.mutable.ListBuffer

object scalaTest {
  var itemList = new ListBuffer[String]()
  def main(args: Array[String]) {
    var support = 0.5
    var count = 0
    var data = Source.fromFile("e:/scalaTest/src/main/scala/abc.csv")
    for (line <- data.getLines) {

      for (v <- line.split(","))
        itemList += v //generating list containing all items

    }
    println("One Frequent Itemset ")
    for (s <- itemList.distinct) {
      count = itemList.count(_ == s)

    if (count/3 >= support)
      println(s)
    }

  }
  }



