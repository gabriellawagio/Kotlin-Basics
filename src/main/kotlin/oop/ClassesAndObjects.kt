package oop

import javax.swing.AbstractListModel

fun main(args: Array<String>) {
    // These are objects
    var f1 = Fruit(name = "Mango", color = "Yellow", size = "Large", price = 40.00)
    var f2 = Fruit(name = "Apple", color = "Green", size = "Small", price = 50.00)
    println(f1.name)
    println(f2.color)

    var c1 = Car(model = "Toyota", reg_no = "KDG 098L", price = 3000000.00)
    var c2 = Car(model = "Mercedes", reg_no = "KCD 678M", price = 4500000.00)
    println(c1.model)
    println(c2.reg_no)
    c2.accelerate()
    c1.brake()
}

// This is a class
class Fruit(name:String, color:String, size:String, price:Double){
    // Declare properties
    var name: String
    var color: String
    var size: String
    var price: Double
    // Initialise the properties
    init {
        this.name = name
        this.color = color
        this.size = size
        this.price = price
    }
}
class Car(model:String, reg_no:String, price: Double){
    var model : String
    var reg_no : String
    var price : Double
    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class functions
    fun accelerate(){
        println("I can accelerate")
    }
    fun brake(){
        println("I can brake")
    }
}
