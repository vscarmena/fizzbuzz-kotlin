class FizzBuzz {

    fun evaluate(number: Int): String {
        if (number % 3 == 0) {
            return "Fizz"
        }
        return number.toString()
    }
}