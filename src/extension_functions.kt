fun main()
{
    println("world".stringReversed("hello"));
}
fun String.stringReversed(anotherString: String): String
{
    println(anotherString);
    return this.reversed(); // this would refer to the string.
}