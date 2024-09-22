fun main()
{
    print("Введите высоту лестницы N:")
    val n = readLine()!!.toInt()
    for (i in 1..n)
    {
        println("#".repeat(i))
    }
}