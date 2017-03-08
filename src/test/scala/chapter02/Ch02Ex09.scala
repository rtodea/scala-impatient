package chapter02

import org.scalatest.FlatSpec

class Ch02Ex09 extends FlatSpec {
  def computeUnicodeProduct(str: String): Int = {
    if (str.length == 0) {
      1
    } else {
      str(0).toInt * computeUnicodeProduct(str.drop(1))
    }
  }

  "compute unicode product recursively" should "for 'Hello' should return 825152896" in {
    assert(this.computeUnicodeProduct("Hello") == 825152896)
  }
}
