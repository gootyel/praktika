import kotlin.random.Random
fun main()
{
    val massa = Array(20) { Random.nextInt(1, 10) }
    println("Начальнный массив: ${massa.joinToString(", ")}")
    val maxLength = findMaxIdenticalSequence(massa)
    println("Максимальная длина последовательности одинаковых элементов: $maxLength")
}
fun findMaxIdenticalSequence(array: Array<Int>): Int
{
    var maxDlina = 1
    var currentDlina = 1
    for (i in 1 until array.size)
    {
        if (array[i] == array[i - 1])
        {
            currentDlina++
        }
        else
        {
            if (currentDlina > maxDlina)
            {
                maxDlina = currentDlina
            }
            currentDlina = 1
        }
    }
    if (currentDlina > maxDlina)
    {
        maxDlina = currentDlina
    }
    return maxDlina
}