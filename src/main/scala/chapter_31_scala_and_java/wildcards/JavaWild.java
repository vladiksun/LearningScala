package chapter_31_scala_and_java.wildcards;

import java.util.Collection;
import java.util.Vector;

public class JavaWild {

    public Collection<?> contents() {

        Collection<String> stuff = new Vector<String>();
        stuff.add("a");
        stuff.add("b");
        stuff.add("see");

        return stuff;
    }
}
