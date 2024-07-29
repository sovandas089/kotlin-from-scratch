////OverRide fun commoFeatures in class CarwithSunroof
//open class Vehicle(val name: String) {
//     open fun commonFeatures(){
//        println("I'm Travelling in  a $name")
//    }
//}
//
//class Bike(name: String) : Vehicle(name){
//
//    fun  specificFeatures(){
//        println( "$name has 2 wheels")
//    }
//}
//
//class CarsWithoutSunroof(name: String) : Vehicle(name){
//
//   fun  specificFeatures(){
//        println( "$name has 4 wheels")
//    }
//}
//  class CarwithSunroof(name:String):Vehicle(name){
//    fun specificFeature(){
//    println("$name has Sunroof")
// }
//
//     override  fun commonFeatures()
//     {
//    println("I'm operating the sunroof in a $name")
//    }
//}
//
//fun main(){
//    val farari = CarwithSunroof("farari")
//    farari.commonFeatures()
//    farari.specificFeature()
//}


//open class Birds(val name: String){
//    fun wingFeature(){
//        println("$name, this Bird have wings")
//    }
//}
//class WaterBird(name: String): Birds(name){
//    fun waterFeature(){
//        println("$name can Swim")
//    }
//}
//class  SkyBird(name: String): Birds(name){
//    fun skyFeatrue(){
//        println("$name can fly ")
//    }
//}
//
//fun main(){
//    val duck = WaterBird("Duck")
//    duck.waterFeature()
//    duck.wingFeature()
//    val eagle = SkyBird("Eagle")
//    eagle.skyFeatrue()
//    eagle.wingFeature()
//}

// Base class Birds
//open class Birds {
//    // Method in the base class
//    open fun wingFeature() {
//        println("Birds have wings.")
//    }
//}
//
//// Derived class WaterBird inheriting from Birds
//class WaterBird : Birds() {
//    // Additional method specific to WaterBird
//    fun waterFeature() {
//        println("Water birds can swim.")
//    }
//}
//
//// Derived class SkyBird inheriting from Birds
//class SkyBird : Birds() {
//    // Additional method specific to SkyBird
//    fun skyFeature() {
//        println("Sky birds can fly high.")
//    }
//}
//
//fun main() {
//    val duck = WaterBird()
//
//    // Calling methods from WaterBird class
//    duck.waterFeature()
//
//    // Calling inherited method from base class Birds
//    duck.wingFeature()
//}



//open class Birds() {
//    open protected  fun wingFeature() {
//        println("They have wings")
//    }
//}
//
//class WaterBird: Birds() {
//    fun waterFeature() {
//        println("They can swim in water")
//    }
//}
//
//class SkyBird(): Birds() {
//    public override fun wingFeature() {
//        println("They have wings and they can fly too")
//    }
//}
//
//fun main(){
//    val internShala = SkyBird()
//    internShala.wingFeature()
//}

data class Book (val title:String, val author:String, val year:Int)

fun  main(){
    val java =Book(
        title = "let's Start Java",
        author = "E.Balaguruswami",
        year = 2010

    )
    println("Book Details : $java")
}
