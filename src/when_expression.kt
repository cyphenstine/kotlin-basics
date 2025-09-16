fun main(){
    println("Enter your age:");
    val input = readln();
    val age = input.toIntOrNull();
    val legalAge = 18;
    val output = when{
        age == null -> "Please enter a valid number";
        age >= legalAge -> "you are an adult";
        age < legalAge -> "you are a minor";
        else -> "enter the right input";
    }
    println(output);
}

