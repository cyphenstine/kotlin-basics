package classes

fun main(){
    val person1 = Person("Aritra", 20)
    println(person1.favMovie) // this actually would through an error, this is better than null pointer exception error because that only happens at run time. But can't use this with primitive datatypes like Int.
}

class Person(name: String, age: Int){
    lateinit var favMovie: String
}