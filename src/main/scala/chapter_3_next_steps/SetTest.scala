package chapter_3_next_steps

object SetTest extends App {
    //If you want a mutable set, you'll need to use an import, as shown in Listing 3.6:
    //import scala.collection.mutable



    // returns an instance of a default, immutable Set
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    import scala.collection.immutable.HashSet
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")
}

