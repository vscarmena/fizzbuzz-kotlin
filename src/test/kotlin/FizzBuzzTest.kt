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
    fun `evaluate regular numbers`(number: Int, expected: String) {
        assertEquals(expected, fizzBuzz.generateValues()[number - 1])
    }

    @ParameterizedTest
    @CsvSource("3", "6")
    fun `evaluate numbers multiple of 3`(number: Int) {
        assertEquals("Fizz", fizzBuzz.generateValues()[number - 1])
    }

    @ParameterizedTest
    @CsvSource("5", "10")
    fun `evaluate numbers multiple of 5`(number: Int) {
        assertEquals("Buzz", fizzBuzz.generateValues()[number - 1])
    }

    @ParameterizedTest
    @CsvSource("15", "30")
    fun `evaluate numbers multiple of 3 and 5`(number: Int) {
        assertEquals("FizzBuzz", fizzBuzz.generateValues()[number - 1])
    }

    @Test
    fun `generate values to print`() {
        assertEquals(100, fizzBuzz.generateValues().size)
    }

}