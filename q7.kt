fun largest(a: Int, b: Int, c: Int): Int {
    var max = a
    if (b > max) max = b
    if (c > max) max = c
    return max
}

fun main() {
    print("Enter first number: ")
    val a = readLine()!!.trim().toInt()
    print("Enter second number: ")
    val b = readLine()!!.trim().toInt()
    print("Enter third number: ")
    val c = readLine()!!.trim().toInt()
    println("Largest = ${largest(a, b, c)}")
}
