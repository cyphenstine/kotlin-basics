fun main(){
    println("Enter your age:");
    val input = readln();
    val age = try {
        input.toInt();
    }catch (e: NumberFormatException){
       0
    }finally {
        println("input is taken care of");
    }
    val legalAge = 18;
    val output = when(age){
//        null -> "Please enter a valid number";
        in 1 until legalAge -> "you are a minor";
        in legalAge until 100 -> "you are an adult";
        else -> "enter the right input";
    }
    println(output);
}
