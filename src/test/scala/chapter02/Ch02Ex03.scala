package chapter02

import org.scalatest.FlatSpec

class Ch02Ex03 extends FlatSpec {
  "x = y = 1" should "set x to Unit type" in {
    var y: Int = 0 // need initial value?
    val x = y = 1
    assert(x.isInstanceOf[Unit])
  }
}
