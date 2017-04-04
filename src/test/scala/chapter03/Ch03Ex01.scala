package chapter03

import org.scalatest.FlatSpec

class Ch03Ex01 extends FlatSpec {
  def randomArray(n: Int): Array[Int] = {
    new Array[Int](n)
  }

  "randomArray" should "have n random integers" in {
    assert(this.randomArray(10).length == 10)
  }

  it should "have 0 amongst elements" in {
    assert(this.randomArray(2).contains(0))

  }

  it should "not have n amongst elements" in {
    assert(this.randomArray(3).contains(1))
  }

  it should "return an empty array if 0 is provided" in {
    assert(this.randomArray(0).length == 0)
  }
}
