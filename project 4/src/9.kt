fun main()
{
    print("Введите строку:")
    val inputString = readLine()
    if (inputString != null)
    {
        val length = inputString.length
        println("Длина введенной строки: $length")
    } else
    {
        println("Строка пуста.")
    }
}