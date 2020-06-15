package fizzBuzz

class Demo {
    fun fizzBuzz(number: Int): String =
            when {
                number % 3 == 0 -> "Fizz"
                number % 5 == 0 -> "Buzz"
                else -> number.toString()
            }

}