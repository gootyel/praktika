fun areAnagrams(str1: String, str2: String): Boolean
{
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()
}

fun main()
{
    print("Введите первую строку:")
    val str1 = readLine()!!
    print("Введите вторую строку:")
    val str2 = readLine()!!
    println("Строки являются анаграммами: ${areAnagrams(str1, str2)}")
}