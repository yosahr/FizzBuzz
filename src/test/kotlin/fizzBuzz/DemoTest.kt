package fizzBuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DemoTest {

    @Test
    fun `should return Fizz when number is 3`() {
        val demo = Demo()
        assertThat(demo.fizzBuzz(3)).isEqualTo("Fizz")
    }
}