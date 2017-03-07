package chapter01

import org.scalatest.FlatSpec

class Exercise5 extends FlatSpec {
  behavior of "max operator"

  /*
   `max` is defined on `RichInt`
   `10 max 2` is the same as `10.max(2)`
   */
  it should "get the maximum between the 10 and 2" in {
    val res = 10 max 2
    assert(res == 10)
  }
}
