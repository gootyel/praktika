import kotlin.math.max


fun main()
{
    print("Ведите первое число: ")
    val a = readLine()!!.toDouble()
    print("Ведите второе число: ")
    val b = readLine()!!.toDouble()
    print("Ведите третье число: ")
    val c = readLine()!!.toDouble()
    val result = max(max(a, b), c)
    println("$result")
}