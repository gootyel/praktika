fun main()
{
    val number: Int
    print("Введите двузначное число: ")
    number = readln().toInt()
     if ((number > 9) && (number < 100)) {
         println("Ваше число - $number")
         println("a)${number / 10}\t\tб)${number % 10}")
         println("в)${number / 10 + number % 10}\t\tг)${(number / 10) * (number % 10)}")
     }

}