package fizzBuzz

class Demo {
    fun fizzBuzz(number: Int): String {
        return if (number % 3 == 0) "Fizz" else number.toString()
    }

}