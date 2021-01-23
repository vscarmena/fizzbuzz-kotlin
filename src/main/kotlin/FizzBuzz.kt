class FizzBuzz {

    fun generateValues(): MutableList<String> {
        val evaluatedNumbers = mutableListOf<String>()
        for (i in 1..100) {
            evaluatedNumbers.add(i - 1, evaluate(i))
        }
        return evaluatedNumbers
    }

    private fun evaluate(number: Int): String {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz"
        }
        if (number % 3 == 0) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }
        return number.toString()
    }
}