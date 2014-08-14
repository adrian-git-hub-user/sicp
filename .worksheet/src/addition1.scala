object addition1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(182); 

  def plus(x: Int, y: Int): Int = {
    if (x == 0) {
      y
    } else {
      val p1 = -1 + x
      val p2 = 1 + y

			println("plus "+p1+","+p2)
      plus(p1, p2)
    }

  };System.out.println("""plus: (x: Int, y: Int)Int""");$skip(15); val res$0 = 

  plus(3, 4);System.out.println("""res0: Int = """ + $show(res$0))}
}
