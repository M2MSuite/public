
object Test1 {

  def f1: Int => Double = x => {
    x - 10
  }

  def f2: Double => Double = x => {
    x + 5
  }

  // QUESTION #1: why can we execute f1 andThen f2, but not the reverse?
  def g1 = f1.andThen(f2)

  // QUESTION #2: Define function g2(x) which is the product of f1(x) and f2(x)
  //def g2: Int => Double = ???

  // QUESTION #3: Using a monad or a partial function, define a function g3(x) which is the ratio of f1(x) to f2(x)
  //def g3: ???


  def main(args: Array[String]) {
    print(s"f1(4) = ${f1(4)}\n")
    print(s"f2(4) = ${f2(4)}\n")
    print(s"g1(4) = ${g1(4)}\n")
  }

}
