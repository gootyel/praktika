fun main()
{
    print("Введите количество чисел:")
    val count = readLine()!!.toInt()
    val numbers = IntArray(count)

    for (i in 0 until count)
    {
        print("Введите число ${i + 1}:")
        numbers[i] = readLine()!!.toInt()
    }

    numbers.sort()
    println("Числа в порядке возрастания: ${numbers.joinToString()}")
}