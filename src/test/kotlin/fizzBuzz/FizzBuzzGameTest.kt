package fizzBuzz

import fizzBuzz.FizzBuzzGame.Companion.play
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzGameTest {

    @Test
    fun `should be Fizz when number is 3`() {
        assertThat(play(3)).isEqualTo("Fizz")
    }

    @Test
    fun `should be 4 when number is 4`() {
        assertThat(play(4)).isEqualTo("4")
    }

    @Test
    fun `should be Buzz when number is 5`() {
        assertThat(play(5)).isEqualTo("Buzz")
    }

    @Test
    fun `should be FizzBuzz when number is 15`() {
        assertThat(play(15)).isEqualTo("FizzBuzz")
    }
}
