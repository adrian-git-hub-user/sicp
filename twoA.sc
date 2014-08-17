import scala.annotation.tailrec

object twoA {
  println("Welcome to the Scala worksheet")

  //Based on lecture 2A

  def sumInt(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      a + sumInt(1 + a, b)
  }

  sumInt(3, 5)

  def sumSquares(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      (a * a) + sumSquares((1 + a), b)
  }

  sumSquares(2, 3)

  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }

  def sum(term: (Int) => Int, a: Int, next: (Int) => Int, b: Int): Int = {
    if (a > b)
      0
    else {
      val toAdd1 = term(a)
      val toAdd2 = toAdd1 + sum(term, next(a), next, b)
      toAdd2
    }
  }

  def sumTailRec(term: (Int) => Int, a: Int, next: (Int) => Int, b: Int): Int = {

    //@tailrec
    def sumTailRecHelper(term: (Int) => Int, a: Int, next: (Int) => Int, b: Int) = {
      if (a > b)
        0
      else {
        val toAdd1 = term(a)
        val toAdd2 = toAdd1 + sum(term, next(a), next, b)
        toAdd2
      }
    }
    sumTailRecHelper(term, a, next, b)

  }

  def useSumInt(a: Int, b: Int) = {
  
   sumInt3(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      a + sumInt(1 + a, b)
  }
    
  }

  def square(x: Int): Int = x * x

  def next(x: Int) = x + 1

  sum(square, 0, next, 200)
  sumTailRec(square, 0, next, 200)

  // def
  //def inc = 1 +
  //def sumInt2(a : Int , b : Int)
}