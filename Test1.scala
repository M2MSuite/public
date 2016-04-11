
object Test1 {

  def f1: Int => Double = x => x - 10

  def f2: Int => Double = x => x + 5

  def main(args: Array[String]) {
    print(s"f1(4) = ${f1(4)}\n")
    print(s"f1(4) = ${f1(4)}\n")
  }

}
