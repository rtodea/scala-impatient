package chapter02

import org.scalatest.FlatSpec

class Ch02Ex07 extends FlatSpec {
  def computeUnicodeProduct(str: String): Int = {
    str.map(_.toInt).product
  }

  "compute unicode product without loop" should "for 'Hello' should return 825152896" in {
    assert(this.computeUnicodeProduct("Hello") == 825152896)
  }
}
