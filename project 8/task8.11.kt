fun viragenie(expression: String): Double {
    val sanitizedExpression = expression.replace(" ", "")
    return when {
        sanitizedExpression.contains("+") -> {
            val parts = sanitizedExpression.split("+")
            parts[0].toDouble() + parts[1].toDouble()
        }
        sanitizedExpression.contains("-") -> {
            val parts = sanitizedExpression.split("-")
            parts[0].toDouble() - parts[1].toDouble()
        }
        sanitizedExpression.contains("*") -> {
            val parts = sanitizedExpression.split("*")
            parts[0].toDouble() * parts[1].toDouble()
        }
        sanitizedExpression.contains("/") -> {
            val parts = sanitizedExpression.split("/")
            parts[0].toDouble() / parts[1].toDouble()
        }
        else -> throw IllegalArgumentException("Unsupported operation")
    }
}

fun main() {
    val expression = readLine().toString()
    println("Результат выражения '$expression': ${viragenie(expression)}")
}