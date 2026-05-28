fun sumUptoN(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    print("Enter N: ")
    val n = readLine()!!.trim().toInt()
    val result = sumUptoN(n)
    println("Sum from 1 to $n = $result")
}
