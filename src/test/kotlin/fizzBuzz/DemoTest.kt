package fizzBuzz

class DemoTest {

    @Test
    fun `should return Fizz when number is 3`() {
        assertThat(demo.fizzBuzz(3)).isEqualTo("Fizz")
    }
}