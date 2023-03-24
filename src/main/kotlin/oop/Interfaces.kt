package oop

fun main(args: Array<String>) {
    var sch1 = School()
    sch1.motto()
    sch1.mission()
}
    interface A {
        fun motto(){
            println("this is our motto")
        }
    }

    interface B {
        fun mission(){
            println("This our mission")
        }
    }

class School: A, B