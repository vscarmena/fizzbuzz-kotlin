import org.junit.jupiter.api.BeforeAll
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

}