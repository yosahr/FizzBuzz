package fizzBuzz

import fizzBuzz.FizzBuzzGame.Companion.play
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzGameTest {

    @Test
    fun `a number divisible by 3 should return Fizz`() {
        assertThat(play(3)).isEqualTo("Fizz")
    }

    @Test
    fun `a number not divisible by 3 or 5 should return itself`() {
        assertThat(play(4)).isEqualTo("4")
    }

    @Test
    fun `a number divisible by 5 should return Buzz`() {
        assertThat(play(5)).isEqualTo("Buzz")
    }

    @Test
    fun `a number divisible by both 3 and 5 should return FizzBuzz`() {
        assertThat(play(15)).isEqualTo("FizzBuzz")
    }
}
