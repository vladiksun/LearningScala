object Operators_prefix extends App {

    -2.0 // Scala invokes (2.0).unary_-

    (2.0).unary_-



    class CustomOperator {

        def unary_+(): Unit = print("+++++++")
    }

    val testCustomOperator = new CustomOperator

    + testCustomOperator
}

