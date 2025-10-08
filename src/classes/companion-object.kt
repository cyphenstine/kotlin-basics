package classes

fun main(){
    // no need for this when companion object is created:
//    val calculator1 = Calculator()
//    println(calculator1.sum(1,2,3,4,5))

    // instead use it like this:
    val result = Calculator.sum(2,3,4,5)
    println(result)
}

class Calculator(){
    companion object{
        fun sum(vararg numbers: Int): Int{
            var result = 0
            for (number in numbers){
                result += number
            }
            return result
        }
    }

}