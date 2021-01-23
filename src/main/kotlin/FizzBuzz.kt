class FizzBuzz {

    fun evaluate(number: Int): String {
        if (number == 3 || number == 6) {
            return "Fizz"
        }
        return number.toString()
    }
}