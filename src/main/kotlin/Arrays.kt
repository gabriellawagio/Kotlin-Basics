fun main(args: Array<String>) {
    var names = arrayListOf("Yvonne", "Eric", "Dennis", "Alphy", "Thelma")
    println(names)
    names.add("Gabbae")
    // Use for in loop to print
    for (i in 0 until  (names.size)){
        println(names[i])
    }
    // for each loop
    names.forEach{
        println(it)
    }
}