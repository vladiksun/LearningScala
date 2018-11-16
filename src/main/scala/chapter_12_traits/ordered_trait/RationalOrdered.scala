package chapter_12_traits.ordered_trait

class RationalOrdered(n: Int, d: Int) extends Ordered[RationalOrdered] {

    require(d != 0)
    println("Created " + n + "/" + d)

    private val g = greatestCommonDivisor(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1) // auxiliary constructor

    /////////////////////////////////////////////////////////////////////////////////
    override def compare(that: RationalOrdered): Int =
        (this.numer * that.denom) - (that.numer * this.denom)
    /////////////////////////////////////////////////////////////////////////////////


    def + (that: RationalOrdered): RationalOrdered =
        new RationalOrdered(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )

    def + (i: Int): RationalOrdered =
        new RationalOrdered(numer + i * denom, denom)


    def - (that: RationalOrdered): RationalOrdered =
        new RationalOrdered(
            numer * that.denom - that.numer * denom,
            denom * that.denom
        )
    def - (i: Int): RationalOrdered =
        new RationalOrdered(numer - i * denom, denom)


    def * (that: RationalOrdered): RationalOrdered =
        new RationalOrdered(numer * that.numer, denom * that.denom)

    def * (i: Int): RationalOrdered =
        new RationalOrdered(numer * i, denom)

    def / (that: RationalOrdered): RationalOrdered =
        new RationalOrdered(numer * that.denom, denom * that.numer)

    def / (i: Int): RationalOrdered =
        new RationalOrdered(numer, denom * i)

    def lessThan(that: RationalOrdered): Boolean =
        this.numer * that.denom < that.numer * this.denom

    def max(that: RationalOrdered): RationalOrdered =
        if (this.lessThan(that))
            that
        else
            this

    override def toString: String = n + "/" + d

    private def greatestCommonDivisor(a: Int, b: Int): Int =
        if (b == 0)
            a
        else
            greatestCommonDivisor(b, a % b)

}
