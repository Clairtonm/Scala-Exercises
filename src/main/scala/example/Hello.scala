package example

import Functions._

object Hello extends Greeting with App {
  println(greeting)

  val exampleList = List(1.2,2.2,3.1,3.0)
//
//  println(lastList(exampleList))
//  println(penultimateList(exampleList))

  print(nthRecursive(exampleList, 3))

}

trait Greeting {
  lazy val greeting: String = "hello"
}