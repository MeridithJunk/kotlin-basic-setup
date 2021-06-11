import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class MainTest {
    private var main = Main()

    @Test
    fun `true is true`() {
        assertEquals(true, main.main())
    }
}