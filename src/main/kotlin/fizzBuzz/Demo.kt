package fizzBuzz

class Demo {

    companion object {
        fun fizzBuzz(number: Int): String =
                when {
                    number % 15 == 0 -> "FizzBuzz"
                    number % 3 == 0 -> "Fizz"
                    number % 5 == 0 -> "Buzz"
                    else -> number.toString()
                }
    }
}