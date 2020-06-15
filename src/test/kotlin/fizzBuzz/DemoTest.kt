package fizzBuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DemoTest {

    @Test
    fun `should be Fizz when number is 3`() {
        val demo = Demo()
        assertThat(demo.fizzBuzz(3)).isEqualTo("Fizz")
    }

    @Test
    fun `should be 4 when number is 4`() {
        val demo = Demo()
        assertThat(demo.fizzBuzz(4)).isEqualTo("4")
    }
}