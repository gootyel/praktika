import kotlin.random.Random
fun main()
{
    val massa = Array(10) { Random.nextInt(-100, 100) }
    println("Начальнный массив: ${massa.joinToString(", ")}")
    val median = findMedian(massa)
    println("Медиана массива: $median")
}
fun findMedian(array: Array<Int>): Double
{
    val sortedMassiv = array.sortedArray()
    val size = sortedMassiv.size

    return if (size % 2 == 0)
    {
        (sortedMassiv[size / 2 - 1] + sortedMassiv[size / 2]) / 2.0
    }
    else
    {
        sortedMassiv[size / 2].toDouble()
    }
}