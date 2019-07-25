package hackerRank

object socksExercise extends App {

    def sockMerchant(n: Int, ar: Array[Int]): Int = {
        val arrayCounted = ar.groupBy(elem => elem).mapValues(_.length)
        arrayCounted.map(_._2 / 2).sum
    }

    val testArray = Array(10, 20, 20, 10, 10, 30, 50, 10, 20)
    println("Result: " + sockMerchant(9, testArray))
}


