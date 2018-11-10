object Equality extends App {

    /*
In Java, you can use == to compare both primitive and reference types. On primitive types,
Java's == compares value equality, as in Scala. On reference types, however,
Java's == compares reference equality, which means the two variables point to the same object on the
JVM's heap. Scala provides a facility for comparing reference equality, as well, under the name eq.
However, eq and its opposite, ne, only apply to objects that directly map to Java objects. The full
        details about eq and ne are given in Sections 11.1and 11.2. Also, see Chapter 30 on how to write a
        good equals method.
        */


    1 == 2 // Boolean = false

    1 != 2 // Boolean = true

    2 == 2 // Boolean = true

    List(1, 2, 3) == List(1, 2, 3) // Boolean = true

    List(1, 2, 3) == List(4, 5, 6) // Boolean = false

    1 == 1.0 // Boolean = true

    List(1, 2, 3) == "hello" // Boolean = false

    List(1, 2, 3) == null // Boolean = false

    null == List(1, 2, 3) // Boolean = false

    ("he" + "llo") == "hello" // Boolean = true
}

