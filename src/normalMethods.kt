fun main(){
    println(stringReversed("hello!"));
    println(sayHello("Aritra"))
    println(sayHello())
    println(message = "this is a message for you")
}

fun stringReversed(stringToReverse: String): String {
    return stringToReverse.reversed();
}

//fun sayHello(name: String = "Stranger", message: String = "hi"): String { // default parameter
//    return "Hello! $name, you have a message: $message"
//}
fun sayHello(name: String = "Stranger", message: String = sendText()): String { // using a function as a parameter
    return "Hello! $name, you have a message: $message"
}

fun sendText(): String {
    return "this is a message"
}