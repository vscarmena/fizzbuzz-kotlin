import org.approvaltests.Approvals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FizzBuzzTest {

    @Test
    fun `evaluate numbers to apply conversion`() {
        Approvals.verifyAll(
            intArrayOf(1, 2, 3, 4, 5, 6, 10, 15, 20, 30, 50, 98, 99, 100).toTypedArray(),
            this::getGeneratedValue
        )
    }

    private fun getGeneratedValue(number: Int): String {
        return FizzBuzz().generateValues()[number - 1]
    }

    @Test
    fun `generate values to print`() {
        assertEquals(100, FizzBuzz().generateValues().size)
    }

}