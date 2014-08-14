object twoA {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(129); 
  
  //Based on lecture 2A
  
  def sumInt(a : Int , b : Int) : Int = {
  	if(a > b)
  		0
  	else
  		a + sumInt(1 + a , b)
  };System.out.println("""sumInt: (a: Int, b: Int)Int""");$skip(19); val res$0 = 
  
  sumInt(3 , 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(118); 
  
  def sumSquares(a : Int , b : Int) : Int = {
  	if(a > b)
  		0
  	else
  		(a * a) + sumSquares((1 + a) , b)
  };System.out.println("""sumSquares: (a: Int, b: Int)Int""");$skip(23); val res$1 = 
  
  sumSquares(2 , 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(111); 
  
  //def term(a : Int) : Int
  
  def sum(term: (param : Int) => Int , next: (Int) => Int) : Int = {
		0
  };System.out.println("""sum: (term: <error>)Unit""")}
  
}
