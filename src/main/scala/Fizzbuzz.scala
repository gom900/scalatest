object Fizzbuzz {
  def main(args: Array[String]): Unit = {
    for(x <-1 to 100){
      var ans = x match {
        case x if x % 15 == 0 => "FizzBuzz"
        case x if x % 3 == 0 => "Fizz"
        case x if x % 5 == 0 => "Buzz"
        case _ => x
      }
      println("ans = " + ans)
    }
  }
}
