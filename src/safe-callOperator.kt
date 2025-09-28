fun main(){
    fun main() {
        println("Enter a number: ")
        val input = readln().toIntOrNull()

        // Safe call to double the number
        val doubled = input?.times(2)
        println("Doubled: ${doubled ?: "Cannot double - invalid input"}")

        // Safe call to check if even
        val isEven = input?.rem(2) == 0
        println("Is even: $isEven")
    }
}