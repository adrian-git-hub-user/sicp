object twoA {
  println("Welcome to the Scala worksheet")
  
  //Based on lecture 2A
  
  def sumInt(a : Int , b : Int) : Int = {
  	if(a > b)
  		0
  	else
  		a + sumInt(1 + a , b)
  }
  
  sumInt(3 , 5)
  
  def sumSquares(a : Int , b : Int) : Int = {
  	if(a > b)
  		0
  	else
  		(a * a) + sumSquares((1 + a) , b)
  }
  
  sumSquares(2 , 3)
  
  //def term(a : Int) : Int
  
  def sum(term: (param : Int) => Int , next: (Int) => Int) : Int = {
		0
  }
  
}