fun main() {
    print("Enter a number: ")
    var num = readLine()!!.trim().toInt()
    var sum = 0
    while (num != 0) {
        sum += num % 10
        num /= 10
    }
    println("Sum of digits = $sum")
}
