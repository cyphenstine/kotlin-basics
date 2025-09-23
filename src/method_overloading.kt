fun main()
{
    val number = 200
    println(number.stringAndIntReversed());
    println((number.stringAndIntReversed()) * 1234)
}
fun String.stringAndIntReversed(): String
{
    return this.reversed(); // this would refer to the string.
}

fun Int.stringAndIntReversed(): Int
{
    return this.toString().reversed().toInt()
}