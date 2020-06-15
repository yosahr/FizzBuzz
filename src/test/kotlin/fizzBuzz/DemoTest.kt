package fizzBuzz

import fizzBuzz.Demo.Companion.fizzBuzz
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DemoTest {

    @Test
    fun `should be Fizz when number is 3`() {
        assertThat(fizzBuzz(3)).isEqualTo("Fizz")
    }

    @Test
    fun `should be 4 when number is 4`() {
        assertThat(fizzBuzz(4)).isEqualTo("4")
    }

    @Test
    fun `should be Buzz when number is 5`() {
        assertThat(fizzBuzz(5)).isEqualTo("Buzz")
    }

    @Test
    fun `should be FizzBuzz when number is 15`() {
        assertThat(fizzBuzz(15)).isEqualTo("FizzBuzz")
    }
}