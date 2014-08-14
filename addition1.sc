object addition1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def plus(x: Int, y: Int): Int = {
    if (x == 0) {
      y
    } else {
      val p1 = -1 + x
      val p2 = 1 + y

			println("plus "+p1+","+p2)
      plus(p1, p2)
    }

  }                                               //> plus: (x: Int, y: Int)Int

  plus(3, 4)                                      //> plus 2,5
                                                  //| plus 1,6
                                                  //| plus 0,7
                                                  //| res0: Int = 7
}