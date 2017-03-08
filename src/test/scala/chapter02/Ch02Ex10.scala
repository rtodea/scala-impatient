package chapter02

import org.scalatest.FlatSpec

class Ch02Ex10 extends FlatSpec {
  def exponentiate(base: Int, exponent: Int): Int = {
    if (exponent == 0) {
      1
    } else {
      if (exponent > 0) {
        if (exponent % 2 == 1) { // n is odd
          base * exponentiate(base, exponent - 1)
        } else { // n is even
          lazy val y = exponentiate(base, exponent/2)
          y * y
        }
      } else { // n is negative
        1/exponentiate(base, -exponent)
      }

    }
  }

  "exponentiate" should "return 1 when exponent is 0" in {
    assert(this.exponentiate(182, 0) == 1)
  }

  it should "return x * x^n-1 when n is positive and odd" in {
    assert(this.exponentiate(2, 1) == 2)
  }

  it should "return y^2 when n is positive and even" in {
    assert(this.exponentiate(3, 2) == 9)
  }

  it should "return 1/x^-n when n is negative" in {
    assert(this.exponentiate(2, -1) == 1/2)
  }
}
