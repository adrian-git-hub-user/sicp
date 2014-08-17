import scala.annotation.tailrec

object twoA {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  println("Welcome to the Scala worksheet");$skip(129); 

  //Based on lecture 2A

  def sumInt(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      a + sumInt(1 + a, b)
  };System.out.println("""sumInt: (a: Int, b: Int)Int""");$skip(17); val res$0 = 

  sumInt(3, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(119); 

  def sumSquares(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      (a * a) + sumSquares((1 + a), b)
  };System.out.println("""sumSquares: (a: Int, b: Int)Int""");$skip(21); val res$1 = 

  sumSquares(2, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(187); 

  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  };System.out.println("""factorial: (n: Int)Int""");$skip(217); 

  def sum(term: (Int) => Int, a: Int, next: (Int) => Int, b: Int): Int = {
    if (a > b)
      0
    else {
      val toAdd1 = term(a)
      val toAdd2 = toAdd1 + sum(term, next(a), next, b)
      toAdd2
    }
  };System.out.println("""sum: (term: Int => Int, a: Int, next: Int => Int, b: Int)Int""");$skip(387); 

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

  };System.out.println("""sumTailRec: (term: Int => Int, a: Int, next: Int => Int, b: Int)Int""");$skip(149); 

  def useSumInt(a: Int, b: Int) = {
  
   sumInt3(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      a + sumInt(1 + a, b)
  }
    
  };System.out.println("""useSumInt: (a: Int, b: Int)Int""");$skip(36); 

  def square(x: Int): Int = x * x;System.out.println("""square: (x: Int)Int""");$skip(29); 

  def next(x: Int) = x + 1;System.out.println("""next: (x: Int)Int""");$skip(30); val res$2 = 

  sum(square, 0, next, 200);System.out.println("""res2: Int = """ + $show(res$2));$skip(35); val res$3 = 
  sumTailRec(square, 0, next, 200);System.out.println("""res3: Int = """ + $show(res$3))}

  // def
  //def inc = 1 +
  //def sumInt2(a : Int , b : Int)
}
