import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `evaluate number 1 return 1`() {
        val fizzBuzz = FizzBuzz()
        val number = fizzBuzz.evaluate(1)
        assertEquals("1", number)
    }
    @Test
    fun `evaluate number 2 return 2`() {
        val fizzBuzz = FizzBuzz()
        val number = fizzBuzz.evaluate(2)
        assertEquals("2", number)
    }

}