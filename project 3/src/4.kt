
fun main()
{
    print("Ведите первое число: ")
    val number1 = readLine()!!.toDouble()
    print("Ведите второе число: ")
    val number2 = readLine()!!.toDouble()
    if ((number1 % number2) == 0.toDouble()){
        println("Кратно")
    }
    else{
        println("не кратно")
    }
}