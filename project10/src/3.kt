fun caesarCipher(text: String, shift: Int): String
{
    val result = StringBuilder()

    for (char in text)
    {
        if (char.isLetter())
        {
            val base = if (char.isLowerCase()) 'a' else 'A'
            val shifted = ((char - base + shift) % 26 + base.toInt()).toChar()
            result.append(shifted)
        }
        else
        {
            result.append(char)
        }
    }

    return result.toString()
}

fun main()
{
    println("Enter text on english")
    val text = readLine().toString()
    val shift = 3

    val encrypted = caesarCipher(text, shift)
    println("Encrypted: $encrypted")

    val decrypted = caesarCipher(encrypted, 26 - shift)
    println("Decrypted: $decrypted")
}
