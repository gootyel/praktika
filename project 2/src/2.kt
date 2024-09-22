fun main()
{
    val number: Int
    print("Введите трехзначное число: ")
    number = readln().toInt()
    if ((number > 99) && (number < 1000))
        println("Ваше число - $number")
    println("a)${number % 10 % 10}\t\tб)${number / 10}")
    println("в)${number / 10 / 10 + number / 10 % 10 + number % 10 % 10}\t\tг)${(number / 10 / 10) * (number / 10 % 10) * (number % 10 % 10)}")
}