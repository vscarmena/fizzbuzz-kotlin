class FizzBuzz {

    fun generateValues(): MutableList<String> {
        val evaluatedNumbers = mutableListOf<String>()
        for (i in 1..100) {
            evaluatedNumbers.add(i - 1, evaluate(i))
        }
        return evaluatedNumbers
    }

    private fun evaluate(number: Int): String {
        return when {
            number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"
            else -> number.toString()
        }
    }
}