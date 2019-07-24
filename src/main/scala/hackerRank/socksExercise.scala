object socksExercise extends App {

    def sockMerchant(n: Int, ar: Array[Int]): Int = {
        
        def auxFunction(acc: Int, arAux: Array[Int]): Int = {
            if (arAux.length == 0){
                acc
            } else {
                val color = arAux.head
                val currentArray = arAux.tail
                val nextArray = arAux.filter(elem => elem = color)
                val currentAcc = currentArray.reduce((a, color) => {
                    if (a == color) 1 else 0
                })

                println("Color: " + color)
                println("currentArray: " + currentArray.foreach(print))
                println("nextArray: " + nextArray)
                println("currentAcc: " + currentAcc)
                
                auxFunction(currentAcc, nextArray)
            }
        }

        auxFunction(0, ar)
    }    

    val testArray = Array(10, 20, 20, 10, 10, 30, 50, 10, 20)
    println("Result: " + sockMerchant(9, testArray))
}


