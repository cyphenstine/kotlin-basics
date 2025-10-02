fun main(){
    val car1 = Car()
    car1.color = "red"
    car1.model = "GTR"

}

class Car{
    var model = ""
    var color = ""

    fun start(car: String){
        println("started $car")
    }
    fun stop(car: String){
        println("stopped $car")
    }
}