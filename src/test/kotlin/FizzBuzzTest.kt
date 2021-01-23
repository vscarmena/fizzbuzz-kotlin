import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FizzBuzzTest {

    private lateinit var fizzBuzz: FizzBuzz

    @BeforeAll
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @ParameterizedTest
    @CsvSource("1, 1", "2, 2")
    fun `evaluate regular numbers`(number: Int, expected: String){
        assertEquals(expected, fizzBuzz.evaluate(number))
    }

    @ParameterizedTest
    @CsvSource("3", "6")
    fun `evaluate numbers multiple of 3`(number: Int){
        assertEquals("Fizz", fizzBuzz.evaluate(number))
    }

    @ParameterizedTest
    @CsvSource("5", "10")
    fun `evaluate numbers multiple of 5`(number: Int){
        assertEquals("Buzz", fizzBuzz.evaluate(number))
    }

    @ParameterizedTest
    @CsvSource("15", "30")
    fun `evaluate numbers multiple of 3 and 5`(number: Int){
        assertEquals("FizzBuzz", fizzBuzz.evaluate(number))
    }

    @Test
    fun `generate values to print`() {
        val evaluatedNumbers = fizzBuzz.generateValues()
        assertEquals(100, evaluatedNumbers.size)
    }

}