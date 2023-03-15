fun main(args: Array<String>) {
    var marks = 90
    var grade = if(marks < 50){
        "E"
    }else if (marks <60){
        "D"
    }
    else if (marks <70){
        "C"
    }
    else if (marks <80){
        "B"
    }
    else{
        "A"
    }
    println(grade)

    var bettingnumber = 0
    var bettingresult = when(bettingnumber){
        1 ->{
            "You lost"
        }
        2 ->{
            "You won"
        }
        3 ->{
            "You lost"
        }
        else ->{
            "Enter a number from 1-3 to bet"
        }
    }
    println(bettingresult)
}