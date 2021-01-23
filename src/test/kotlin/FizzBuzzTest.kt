import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    lateinit var fizzBuzz: FizzBuzz

    @BeforeEach
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun `evaluate number 1 return 1`() {
        assertEquals("1", fizzBuzz.evaluate(1))
    }

    @Test
    fun `evaluate number 2 return 2`() {
        assertEquals("2", fizzBuzz.evaluate(2))
    }

    @Test
    fun `evaluate number 3 return Fizz`() {
        assertEquals("Fizz", fizzBuzz.evaluate(3))
    }

    @Test
    fun `evaluate number 6 return Fizz`() {
        assertEquals("Fizz", fizzBuzz.evaluate(6))
    }

}