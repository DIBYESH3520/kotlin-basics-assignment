fun main() {
    print("Enter a number: ")
    var num = readLine()!!.trim().toInt()
    var rev = 0
    while (num != 0) {
        val digit = num % 10
        rev = rev * 10 + digit
        num /= 10
    }
    println("Reversed number: $rev")
}
