package com.rockthejvm

object Basics extends App {
  // value ==> const int meaningOfLife = 42;
  val meaningOfLife: Int = 42
  val aBoolean = false  // type is optional
  // Int, Boolean, Char, Double, Float, String
  // Strings:
  val aString = "I love Scala" + " a lot."
  val interpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions = structures that can be reduced to a value
  val anExpression = 2 + 3
  // if-expression ==> same as a > b ? c : d
  val ifExpression = if (meaningOfLife > 43) 56 else 999  // parenthesis obligatory?
  val chainedExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 42) -2
    else 0

  // code blocks will understand type
  val aCodeBlock = {
    val localValue = 67
    // value of the block is the last expression (value returned by the block?)
    localValue + 3
  }

  // function
  def myFunc(nameOfInt: Int, nameOfString: String): String = {
    // this is a code block, essentially
    // and I return an expression
    nameOfInt + " is " + nameOfString
  }
  // recursive functions
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  // In Scala we don't use loops or iterations, we use RECURSION!

  // the Unit type ==> no return value aka "void"
  // type of SIDE EFFECTS
  println("I'm learning Scala")

  def myVoidFunc(): Unit = {
    println("I'm returning Unit even though it's 'void'.")
  }

  // the "void" value
  val theUnit: Unit = ()
}
