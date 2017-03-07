package chapter01

import org.scalatest.FlatSpec

class Ch01Ex04 extends FlatSpec {
  behavior of "multiplication operator on String"

  /*
   You can find the documentation for the * operator
   in the StringOps
   */
  it should "concatenate the string with itself 3 times" in {
    val res = "crazy" * 3
    assert(res == "crazycrazycrazy")
  }
}
