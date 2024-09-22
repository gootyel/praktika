fun main()
{
    println("Введите длины сторон треугольника (a, b, c)")
    print("a= ")
    val a = readLine()!!.toDouble()
    print("b= ")
    val b = readLine()!!.toDouble()
    print("c= ")
    val c = readLine()!!.toDouble()

    val triangleType = getTriangleType(a, b, c)
    println("Треугольник со сторонами:$a, $b, $c, является $triangleType")
}

fun getTriangleType(a:Double, b:Double, c:Double):String
{
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
    {
        return "Такого треугольника не существует"
    }
    return when
    {
        a == b && b == c -> "равносторонним"
        a == b || a == c || b == c -> "равнобедренным"
        else -> "разносторонним"
    }
}