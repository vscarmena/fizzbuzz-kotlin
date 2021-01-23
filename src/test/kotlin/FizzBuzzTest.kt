import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class FizzBuzzTest {

    lateinit var fizzBuzz: FizzBuzz

    @BeforeEach
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

}