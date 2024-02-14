/*
* Herencia: Permite la creacion de nuevas clases basadas en clases existentes.
* Ventaja: Facilita la reutilizacion de codigo
* */
//fun main(){
//    val car = Car("Tesla",2024,"Model S")
//    println("Brand: ${car.brand}")
//    println("Year: ${car.year}")
//    println("Model: ${car.model}")
//}
//
//open class Vehicle(val brand: String, val year: Int,val model: String){
//    fun accelerate(){
//        println("The vehicle is accelerating")
//    }
//
//    fun brake(){
//        println("The car is braking")
//    }
//}
//
//class Car(brand:String,year:Int,model:String) : Vehicle(brand,year,model){
//    fun autopilot(){
//        println("Auto pilot enabled")
//    }
//}