fun main(){
    println("Enter first number: ");
    val input1 = readln().toIntOrNull() ?: 0; // setting a default value, if the input is null this would be sent.
    println("Enter second number: ");
    val input2 = readln().toIntOrNull() ?: 0; // setting a default value
    val result = input1 + input2;
    println("result: $result");
}