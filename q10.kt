fun checkVowelOrConsonant(ch: Char) {
    val c = ch.lowercaseChar()
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        println("$ch is a Vowel")
    } else {
        println("$ch is a Consonant")
    }
}

fun main() {
    print("Enter a character: ")
    val ch = readLine()!!.trim()[0]
    checkVowelOrConsonant(ch)
}
