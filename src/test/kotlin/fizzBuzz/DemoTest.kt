package fizzBuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DemoTest {

    private val demo = Demo()

    @Test
    fun `should be Fizz when number is 3`() {
        assertThat(demo.fizzBuzz(3)).isEqualTo("Fizz")
    }

    @Test
    fun `should be 4 when number is 4`() {
        assertThat(demo.fizzBuzz(4)).isEqualTo("4")
    }

    @Test
    fun `should be Buzz when number is 5`() {
        assertThat(demo.fizzBuzz(5)).isEqualTo("Buzz")
    }
}