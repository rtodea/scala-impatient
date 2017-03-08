package chapter02

import org.scalatest.FlatSpec

class Ch02Ex04 extends FlatSpec {
  "for (int i = 10; i >= 0; i--) System.out.println(i);" should "be written in Scala" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      for (i <- 10 to 1 by -1) {
        println(i)
      }
    }
    assert(stream.toString == "10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n")
  }
}
