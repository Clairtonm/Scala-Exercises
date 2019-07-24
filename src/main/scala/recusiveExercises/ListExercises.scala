package example

import java.util.NoSuchElementException

object Functions {

  def lastList[A](l: List[A]): A = l match {
    case h :: Nil  => h
    case _ :: tail => lastList(tail)
    case _         => throw new NoSuchElementException
  }

  def penultimateList[A](l: List[A]): A = {
    if (l.isEmpty) throw new NoSuchElementException
    else l.init.last
  }

  def penultimateListAlternative[A](l: List[A]): A = l match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateListAlternative(tail)
    case _             => throw new NoSuchElementException
  }

  def nth[A](l: List[A], n: Int): A = {
    if(n >= 0 && n <= l.size) l(n)
    else throw new NoSuchElementException
  }

  def nthRecursive[A](l: List[A], n: Int):A = (n, l) match {
    case (0, h :: _)    => h
    case (n, _ :: tail) => nthRecursive(tail, n-1)
    case (_, Nil)       => throw new NoSuchElementException
  }

  def length[A](l: List[A]):Int = {
    l.size
  }

  def lengthSimpleRecursive[A](l: List[A]):Int = {
    ???
  }

}
