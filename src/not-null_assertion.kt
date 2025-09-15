fun main(){
    println("Addition program!");
    println("Enter first number: ");
    val input1 = readln().toIntOrNull();
    println("Enter second number: ");
    val input2 = readln().toIntOrNull();
    val result = input1!! + input2!!; // The not-null assertion operator (!!) converts a nullable type to a non-null type. It's used when you're certain a value won't be null. If there is any null value, the program will crash with a NullPointerException.
    println("result: $result");

}