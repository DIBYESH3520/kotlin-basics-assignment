fun main() {
    print("Enter a number: ")
    val num = readLine()!!.trim().toInt()
    println("Multiplication table of $num:")
    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}
