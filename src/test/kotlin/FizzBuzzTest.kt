import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `evaluate number 1 return 1`() {
        val fizzBuzz = FizzBuzz()
        val number = fizzBuzz.evaluate(1)
        assertEquals("1", number)
    }

}