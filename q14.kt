fun main() {
    print("Enter N: ")
    val n = readLine()!!.trim().toInt()
    println("Prime numbers from 1 to $n:")
    for (i in 2..n) {
        var isPrime = true
        for (j in 2..i / 2) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            print("$i ")
        }
    }
    println()
}
