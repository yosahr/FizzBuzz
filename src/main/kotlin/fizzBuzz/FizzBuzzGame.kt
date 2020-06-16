package fizzBuzz

class FizzBuzzGame {

    companion object {
        fun play(number: Int): String =
                when {
                    number % 15 == 0 -> "FizzBuzz"
                    number % 3 == 0 -> "Fizz"
                    number % 5 == 0 -> "Buzz"
                    else -> number.toString()
                }
    }
}
