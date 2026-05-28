fun main() {
    print("Enter a number: ")
    val num = readLine()!!.trim().toInt()
    var temp = num
    var rev = 0
    while (temp != 0) {
        rev = rev * 10 + temp % 10
        temp /= 10
    }
    if (num == rev) {
        println("$num is a Palindrome")
    } else {
        println("$num is not a Palindrome")
    }
}
