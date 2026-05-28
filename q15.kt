fun main() {
    print("Enter number of terms: ")
    val n = readLine()!!.trim().toInt()
    var a = 0
    var b = 1
    print("Fibonacci series: ")
    for (i in 1..n) {
        print("$a ")
        val next = a + b
        a = b
        b = next
    }
    println()
}
