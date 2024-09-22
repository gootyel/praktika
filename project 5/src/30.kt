fun main()
{
    print("Введите целое число:")
    val number = readLine()!!.toInt()
    val binary = Integer.toBinaryString(number)
    println("двоичное явление: $binary")
}