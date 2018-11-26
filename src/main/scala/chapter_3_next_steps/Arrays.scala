package chapter_3_next_steps

object Arrays extends App {

    val big = new java.math.BigInteger("12345")

    val greetStrings = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    // DSL style
    //if a method takes only one parameter, you can call it without a dot or parentheses.
    for (i <- 0 to 2)
        print(greetStrings(i))

    for (i <- 0.to(2))
        print(greetStrings(i))


    val greetStrings2: Array[String] = new Array[String](3)

    //if a method takes only one parameter, you can call it without a dot or parentheses.
    print("String" length)
    print("String".length)



    val numNames = Array("zero", "one", "two")

    // more verbose
    val numNames2 = Array.apply("zero", "one", "two")
}





