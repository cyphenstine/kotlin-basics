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

    val rect3 = rect2 // rect3 is just a reference of rect2. Though rect3 itself is not an object, it just points to rect2.

    val rect4 = rect1.copy() // This does create an object named rect4 and copies the value of rect1 to rect4. Can use ".copy()" with data class only.

    println(rect1 == rect2)// true, because this is a data class.
    println(rect2 == rect3) // true, because this is a data class.
    println(rect3) // prints everything in a very human-readable way, instead of printing memory address like a normal class.
    println(rect4)
    println("The diagonal is: ${rect1.diagonal}")

    val cir1 = Circle(23)
    val cir2 = Circle(23)

    println(cir2 == cir1) // false, because first it's not a data class, and second both are different objects in different memory location.
}

data class Rectangle (val width: Double, val height: Double) {
    val diagonal = sqrt(width * width + height* height)
    val area = width * height
}

class Circle (val radius: Int){
    val circumference = 3.14 * radius
}