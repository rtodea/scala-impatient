package chapter01

import org.scalatest.FlatSpec

class Exercise3 extends FlatSpec {
  behavior of "res from the REPL"

  /*
   res is of type val
   */
  it should "true" in {
    assert(true)
  }
}
