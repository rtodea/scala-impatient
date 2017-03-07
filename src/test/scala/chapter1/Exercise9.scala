package chapter1

import org.scalatest.FlatSpec

class Exercise9 extends FlatSpec {
  /*
    We could also use fixtures via the before-and-after trait
    Read more [here](http://www.scalatest.org/user_guide/sharing_fixtures)
   */
  val stringToBeManipulated = "Hello world!"

  "String manipulation" should "return first character" in {
    assert(stringToBeManipulated(0).toString == "H")
  }

  it should "return last character via implicit apply" in {
    val lastPosition = stringToBeManipulated.length - 1
    assert(stringToBeManipulated(lastPosition).toString == "!")
  }

  it should "return last character via takeRight" in {
    assert(stringToBeManipulated.takeRight(1) == "!")
  }
}
