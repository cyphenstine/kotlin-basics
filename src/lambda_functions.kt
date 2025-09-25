import javax.sql.rowset.Predicate

fun main() {
    println("Enter a string")
    val input = readln()

    // filtering only letters:
    val lettersOnly = input.filter{
        it.isLetter()
    }

    // filtering only even numbers:
    val favNumbers = intArrayOf(1,2,3,4,5,69)
    val evenNumbers = favNumbers.filter { it % 2 == 0 }

    // filtering only letters, but in other way:
    val aLambda:(Char) -> Boolean = {
        it.isLetter()
    }
    val lettersOnly2 = input.myFilter (aLambda)

    println(lettersOnly)
    println(evenNumbers)
    println(lettersOnly2)
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@myFilter){
            if (predicate(char)){
                append(char)
            }
        }
    }
}