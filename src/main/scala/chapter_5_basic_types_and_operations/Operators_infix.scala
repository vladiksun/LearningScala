object Operators_infix extends App {

    val sum = 1 + 2 // Scala invokes 1.+(2)
    val sumMore = 1.+(2)

    val longSum = 1 + 2L // Scala invokes 1.+(2L)

    val s = "Hello, world!"
    s indexOf 'o' // Scala invokes s.indexOf('o')

    s indexOf ('o', 5) // Scala invokes s.indexOf('o', 5)
}





