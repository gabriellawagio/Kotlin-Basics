package oop

fun main(args: Array<String>) {
    var p1 = Person(name = "Gabbae", age = "18")
    // Request salary and Residence through access modifiers
    p1.setSalary(300000.00)
    p1.setResidence("Nairobi")
    // Print salary and residence through access modifiers
    println(p1.getResidence())
    println(p1.getSalary())
}

class Person(var name:String, var age:String){
    private var salary:Double = 0.0
    private var residence:String = ""
    fun setSalary(salary:Double){
        this.salary = salary
    }
    fun getSalary():Double{
        return this.salary
    }
    fun setResidence(residence:String){
        this.residence = residence
    }
    fun getResidence():String{
        return this.residence
    }
    fun walk(){
        println("I can walk")
    }
    fun run(){
        println("I can run")
    }
}