import kotlin.math.sqrt

fun main(){
    val rect1 = Rectangle(
        width = 5.2,
        height = 7.0
    )

    val rect2 = Rectangle(
        width = 5.2,
        height = 7.0
    )

    val rect3 = rect2

    println(rect1 == rect2)// false, because both are separate objects, with separate memory locations.
    println(rect2 == rect3) // true, because rect3 is just a reference of rect2
    println("The diagonal is: ${rect1.diagonal}")
}

data class Rectangle (val width: Double, val height: Double) {
    val diagonal = sqrt(width * width + height* height)
    val area = width * height
}