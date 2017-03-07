package chapter1

import org.scalatest.FlatSpec

class Exercise4 extends FlatSpec {
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
