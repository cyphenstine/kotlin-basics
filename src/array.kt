fun main(){
    val numbers = intArrayOf(1,2,3,4);
    val names = arrayOf("Aritra", "Amitendu", "Parag");
    println(names);
    println(numbers[1]);
    for (i in numbers){
        println(i);
    }

    val combination = arrayOf("Aritra", 20, "Amitendu", 20)

    for (i in combination){
        if (i is Int){ // this is how type is checked
            println(i)
        }
    }
}

