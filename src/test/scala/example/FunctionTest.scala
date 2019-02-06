package example

import org.scalatest.{FlatSpec, Matchers}
import Functions._

class FunctionTest extends FlatSpec with Matchers {

  private val exampleList = List(5,2,1,5,4,3,7)

  // lastList Function

  "The lastList function" should  "be able to return the last element of a list" in {
    lastList(exampleList) shouldEqual 7
  }

  it should "throw a NoSuchElementException when the list has zero elements" in {
    intercept[NoSuchElementException]{
      lastList(List())
    }
  }

  // penultimateList function

  "The penultimateList function" should  "be able to return the penultimate element of a list" in {
    penultimateList(exampleList) shouldEqual 3
  }

  it should "throw a NoSuchElementException when the list has zero elements" in {
    intercept[NoSuchElementException]{
      penultimateList(List())
    }
  }

  // penultimateListAlternative function

  "The penultimateListAlternative function" should  "be able to return the penultimate element of a list" in {
    penultimateListAlternative(exampleList) shouldEqual 3
  }

  it should "throw a NoSuchElementException when the list has zero elements" in {
    intercept[NoSuchElementException]{
      penultimateListAlternative(List())
    }
  }

  // Nth function

  "The nth function" should "return the Nth element of a list" in {
    nth(exampleList, 3) shouldEqual 5
  }

  it should "throw a NoSuchElementException when 'n' is bigger than list size" in {
    intercept[NoSuchElementException]{
      nth(exampleList, 10)
    }
  }

  // Nth recursive function

  "The nthRecursive function" should "return the Nth element of a list" in {
    nthRecursive(exampleList, 3) shouldEqual 5
  }

  it should "throw a NoSuchElementException when 'n' is bigger than list size" in {
    intercept[NoSuchElementException]{
      nthRecursive(exampleList, 10)
    }
  }

  // Length function

  "The length function" should "return the number of elements of a list" in {
    Functions.length(exampleList) shouldEqual 7
  }

  // Length simple recursive function

  "The length function" should "return the number of elements of a list" in {
    Functions.length(exampleList) shouldEqual 7
  }
}
