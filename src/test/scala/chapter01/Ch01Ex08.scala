package chapter01

import org.scalatest.FlatSpec

import scala.math.BigInt.probablePrime
import scala.util.Random

class Ch01Ex08 extends FlatSpec {
  "Generating a random file/dir name" should "use a random BigInt and toString(radix)" in {
    val randomBigInt = probablePrime(100, Random)
    val fileName = randomBigInt.toString(36)
    assert(fileName.length == 20)
  }
}
