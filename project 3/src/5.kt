fun main()
{
    print("Ведите первое число: ")
    val a = readLine()!!.toInt()
    print("Ведите второе число: ")
    val b = readLine()!!.toInt()
    print("Ведите третье число: ")
    val c = readLine()!!.toInt()
    if (b > (a+c)){
        println("Ошибка")
    }
    else if (a > (b+c)){
        println("Ошибка")
    }
    else if (c > (a+b)){
        println("Ошибка")
    }
    else {
        println("Ок")
    }
}