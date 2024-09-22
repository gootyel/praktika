import kotlin.math.pow

fun main()
{
    print("Введите число: ")
    val x = readln().toDouble()
    print("Введите степень, в которую будем возводить число: ")
    val y = readln().toInt()
    println("$x ^ $y = ${x.pow(y)}")
}