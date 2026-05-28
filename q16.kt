fun celsiusToFahrenheit(c: Double): Double {
    return (c * 9 / 5) + 32
}

fun fahrenheitToCelsius(f: Double): Double {
    return (f - 32) * 5 / 9
}

fun main() {
    println("Temperature Converter")
    println("1. Celsius to Fahrenheit")
    println("2. Fahrenheit to Celsius")
    print("Choose option: ")
    val choice = readLine()!!.trim().toInt()

    if (choice == 1) {
        print("Enter temperature in Celsius: ")
        val c = readLine()!!.trim().toDouble()
        println("${c}°C = ${celsiusToFahrenheit(c)}°F")
    } else if (choice == 2) {
        print("Enter temperature in Fahrenheit: ")
        val f = readLine()!!.trim().toDouble()
        println("${f}°F = ${fahrenheitToCelsius(f)}°C")
    } else {
        println("Invalid option")
    }
}
