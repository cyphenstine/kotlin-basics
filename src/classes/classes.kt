package classes

fun main(){
    val car1 = Car()
    car1.color = "red"
    car1.model = "GTR"

    println("The car model is: ${car1.model}")

    val student1 = Student("Aritra", 23)

    println("classes.Student name is: ${student1.studentName}")

    val teacher1 = Teacher("Anik", 1)

    println(teacher1.teacherId)

    val student2 = Student()

    println(student2.studentName)

    val teacher2 = Teacher()

    println(teacher2.name)


}

class Car{
    var model = ""
    var color = ""

    fun start(car: String){
        println("started $car")
    }
    fun stop(car: String){
        println("stopped $car")
    }

}

    // constructor & initializer:
    // initializer runs just after initializing an object

class Student(name: String = "no-name", roll: Int = 0){
    val studentName: String
    val studentRollNumber = roll

    init {
        if (name.lowercase().startsWith("x")){
            studentName = name
            println("you are probably chinese!")
        }
        else{
            studentName = name
            println("you are probably not chinese!")
        }
    }
}

class Teacher(var name: String, val teacherId: Int){ // here value is assigned directly into parameters, can't check values before assigning or perform other operations before assigning. val and var both works.

    // secondary constructors: can't create its own parameters, can only work with parameters declared in primary constructor

    constructor(name: String): this(name, 0){
        println("2nd")
    } // the "this" part is actually calling primary constructor
    constructor(teacherId: Int) : this("no name", teacherId){
        println("3rd")
    }
    constructor(): this("no name", 0){
        println("4th")
    }
}

