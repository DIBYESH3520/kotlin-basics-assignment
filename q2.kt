fun main() {
    print("Enter a number: ")
    val num = readLine()!!.trim().toInt()
    if (num % 2 == 0) {
        println("$num is Even")
    } else {
        println("$num is Odd")
    }
}
