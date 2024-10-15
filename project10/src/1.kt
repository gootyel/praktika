fun countdown(n: Int): List<Int>
{
    return if (n > 0) (n downTo 1).toList()
    else emptyList()
}

fun main()
{
    println(countdown(5))
    println(countdown(1))
    println(countdown(0))
    println("Введите значение")
    val a = readLine()!!.toInt()
    println(countdown(a))
}