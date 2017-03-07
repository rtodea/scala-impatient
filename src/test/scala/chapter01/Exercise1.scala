package chapter01

import org.scalatest.FlatSpec

class Exercise1 extends FlatSpec {
  behavior of "3"

  it should "be an instance of class int" in {
    assert("int" == 3.getClass.toString)
  }

  // TODO: use reflection to count the members
  // http://docs.scala-lang.org/overviews/reflection/overview.html
  // import reflect.runtime.{universe => ru}
  // ru.typeOf[A].members
  /*
  !=   >>>            hashCode        min              toHexString
  ##   ^              intValue        ne               toInt
  %    abs            isInfinite      notify           toLong
  &    asInstanceOf   isInfinity      notifyAll        toOctalString
  *    byteValue      isInstanceOf    round            toRadians
  +    ceil           isNaN           self             toShort
  -    compare        isNegInfinity   shortValue       toString
  ->   compareTo      isPosInfinity   signum           unary_+
  /    doubleValue    isValidByte     synchronized     unary_-
  <    ensuring       isValidChar     to               unary_~
  <<   eq             isValidInt      toBinaryString   underlying
  <=   equals         isValidLong     toByte           until
  ==   floatValue     isValidShort    toChar           wait
  >    floor          isWhole         toDegrees        |
  >=   formatted      longValue       toDouble         →
  >>   getClass       max             toFloat
  */
}
