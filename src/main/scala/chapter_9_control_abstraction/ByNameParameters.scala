package chapter_9_control_abstraction

object ByNameParameters {

    // Without using by-name parameters
    var assertionsEnabled = true
    def myAssert(predicate: () => Boolean) =
        if (assertionsEnabled && !predicate())
            throw new AssertionError

    myAssert(() => 5 > 3)

    // using by-name parameters
    def byNameAssert(predicate: => Boolean) =
        if (assertionsEnabled && !predicate)
            throw new AssertionError

    byNameAssert(5 > 3)

//    A by-name type, in which the empty parameter list, (), is left out, is only allowed for parameters. There
//    is no such thing as a by-name variable or a by-name field.


//    Now, you may be wondering why you couldn't simply write myAssert using a plain old Booleanfor the
//    type of its parameter, like this:
    def boolAssert(predicate: Boolean) =
        if (assertionsEnabled && !predicate)
            throw new AssertionError

    // wrong
//    Nevertheless, one difference exists between these two approaches that is important to note. Because the
//    type of boolAssert's parameter is Boolean, the expression inside the parentheses inboolAssert(5 > 3) is
//            evaluated before the call to boolAssert. The expression 5 > 3 yields true, which is passed to boolAssert.
//            By contrast, because the type of byNameAssert's predicate parameter is=> Boolean, the expression
//            inside the parentheses in byNameAssert(5 > 3) is not evaluated before the call to byNameAssert.
//            Instead a function value will be created whose apply method will evaluate 5 > 3, and this function
//    value will be passed to byNameAssert.
    boolAssert(5 > 3)

}
