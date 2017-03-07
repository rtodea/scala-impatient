package chapter02

import org.scalatest.FlatSpec

class Ch02Ex02 extends FlatSpec {
  "{}" should "be of value ()" in {
    assert({} == ())
  }

  it should "be of type Unit (void)" in {
    assert({}.isInstanceOf[Unit])
  }
}
