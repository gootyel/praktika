fun main()
{
    print("Введите натуральное число: ")
    val number = readLine()!!.toInt()

    if (number % 2 == 0)
    {
        println("Число четное.")
    }
    else
    {
        println("Число нечетное.")
    }

    if (number % 10 == 7) {
        println("Число оканчивается цифрой 7.")
    } else {
        println("Число не оканчивается цифрой 7.")
    }
}