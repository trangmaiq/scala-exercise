package Mathematics

object Fibonacci {
  // Write a recursive function to get the n th Fibonacci number.
  def getTheFibonacciNumber(n :Int) :Int = {
    if (n < 3 ) n -1 else getTheFibonacciNumber(n - 1) + getTheFibonacciNumber(n - 2)
  }
}
