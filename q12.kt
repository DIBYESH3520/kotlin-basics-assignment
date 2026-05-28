fun main() {
    print("Enter first number: ")
    var a = readLine()!!.trim().toInt()
    print("Enter second number: ")
    var b = readLine()!!.trim().toInt()

    println("Before swap: a = $a, b = $b")

    val temp = a
    a = b
    b = temp
    println("After swap (with temp): a = $a, b = $b")

    a = a + b
    b = a - b
    a = a - b
    println("After swap (without temp): a = $a, b = $b")
}
