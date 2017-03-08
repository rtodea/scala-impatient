package chapter02

import org.scalatest.FlatSpec

class Ch02Ex06 extends FlatSpec {
  def computeUnicodeProduct(str: String): Int = {
    var product = 1
    for (s <- str) {
      product *= s.toInt // note that BigInt should be used
    }
    product
  }

  "compute unicode product" should "for 'Hello' should return 825152896" in {
    assert(this.computeUnicodeProduct("Hello") == 825152896)
  }
}
