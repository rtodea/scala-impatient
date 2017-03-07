package chapter01

import org.scalatest.FlatSpec
import scala.math.BigInt.probablePrime
import scala.util.Random

class Exercise7 extends FlatSpec {
  behavior of "importing a specific method"

  it should "import probablePrime and Random" in {
    val res = probablePrime(100, Random)
    assert(res.isProbablePrime(0))
  }
}
