fun main() {
    print("Enter a number: ")
    val n = readLine()!!.trim().toInt()
    var fact = 1
    for (i in 1..n) {
        fact *= i
    }
    println("Factorial of $n = $fact")
}
