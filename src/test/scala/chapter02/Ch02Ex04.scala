package chapter02

import org.scalatest.FlatSpec

class Ch02Ex04 extends FlatSpec {
  "for (int i = 10; i >= 0; i--) System.out.println(i);" should "be written in Scala" in {
    var output = ""
    for (i <- 10 to 1 by -1) {
      println(i)
      output += i.toString
    }
    assert(output == "10987654321")
  }
}
