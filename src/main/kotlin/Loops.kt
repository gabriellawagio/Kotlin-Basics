fun main(args: Array<String>) {
    //1. While loop
        // while loop
    var counterone = 0
    while (counterone <= 5){
        println(counterone)
        counterone++
    }
        // do while
    var countertwo = 10
    do {
        println(countertwo)
        countertwo++
    }while (countertwo <= 15)

    //2. For loop
        // for in loop
    for (num in 20..25) {
        println(num)
    }
    for (num2 in 50 downTo  45 ){
        println(num2)
    }
        // for each loop
    var names = listOf("Sarah", "Daniel", "Lydia", "Daisy", "Prochorus")
    names.forEach{
        println(it)
    }

    //3. Repeat loop
    repeat(times = 5){
        println("Hello World")
    }
}