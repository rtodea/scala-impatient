package chapter01

import org.scalatest.FlatSpec
import scala.math.{pow, sqrt, rint}

class Exercise2 extends FlatSpec {
  behavior of "square root of 3"

  it should "be almost equal with 3" in {
    val sqrt3 = sqrt(3)
    val sqrt3to2 = pow(sqrt3, 2)
    assert(2.99 < sqrt3to2 && sqrt3to2 < 3)
    assert(rint(sqrt3to2) == 3)
  }
}
