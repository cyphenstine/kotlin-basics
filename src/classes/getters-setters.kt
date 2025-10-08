package classes

fun main(){
    val user1 = User("Aritra", 20)
    println(user1.nameOfUser)
}

class User(name: String = "no name provided", age: Int = 0){
    var nameOfUser = name
        // kotlin automatically initializes getter and setter methods, use these only if it is necessary to override these methods.
        get() {
            return "User's name: $field"
        }
        set(value) {
            println("$value was assigned!")
            field = value // have to use "field" otherwise if "nameOfUser" is used it would call the setter infinitely. It is a special kinda variable.
        }
}