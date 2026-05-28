fun simpleInterest(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}

fun main() {
    print("Enter Principal: ")
    val p = readLine()!!.trim().toDouble()
    print("Enter Rate of interest: ")
    val r = readLine()!!.trim().toDouble()
    print("Enter Time (years): ")
    val t = readLine()!!.trim().toDouble()

    val si = simpleInterest(p, r, t)
    println("Simple Interest = $si")
}
