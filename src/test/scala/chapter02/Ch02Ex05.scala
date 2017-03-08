package chapter02

import org.scalatest.FlatSpec

class Ch02Ex05 extends FlatSpec {
  def countdown(n: Int): Unit = {
    for (i <- n to 0 by -1) {
      println(i)
    }
  }

  def assertCountdownForInputOutputs(input: Int, output: String): Unit = {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      this.countdown(input)
    }
    assert(stream.toString == output)
  }

  "countdown" should "print a range from 10 to 0" in {
    this.assertCountdownForInputOutputs(10, "10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n0\n")
  }

  it should "print nothing for negative values" in {
    this.assertCountdownForInputOutputs(-1, "")
  }

  it should "print 0 for 0" in {
    this.assertCountdownForInputOutputs(0, "0\n")
  }
}
