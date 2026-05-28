fun main() {
    print("Enter a number: ")
    var num = readLine()!!.trim().toInt()
    var count = 0
    while (num != 0) {
        num /= 10
        count++
    }
    println("Number of digits: $count")
}
