package chapter02

import org.scalatest.FlatSpec

class Ch02Ex01 extends FlatSpec {
  def signum(n: Int): Int = {
    if (n > 0) 1 else if (n < 0) -1 else 0
  }

  "Signum" should "return 1 for positive numbers" in {
    assert(this.signum(1) == 1)
  }

  it should "return -1 for negative numbers" in {
    assert(this.signum(-1) == -1)

  }

  it should "return 0 for 0" in {
    assert(this.signum(0) == 0)
  }
}
