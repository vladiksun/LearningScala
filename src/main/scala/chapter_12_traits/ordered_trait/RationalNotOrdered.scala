package chapter_12_traits.ordered_trait

class RationalNotOrdered(n: Int, d: Int) {

    require(d != 0)
    println("Created " + n + "/" + d)

    private val g = greatestCommonDivisor(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1) // auxiliary constructor

    /////////////////////////////////////////////////////////////////////////////////
    def < (that: RationalNotOrdered): Boolean =
        this.numer * that.denom < that.numer * this.denom
    def > (that: RationalNotOrdered): Boolean = that < this
    def <= (that: RationalNotOrdered): Boolean = (this < that) || (this == that)
    def >= (that: RationalNotOrdered): Boolean = (this > that) || (this == that)
    /////////////////////////////////////////////////////////////////////////////////


    def + (that: RationalNotOrdered): RationalNotOrdered =
        new RationalNotOrdered(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )

    def + (i: Int): RationalNotOrdered =
        new RationalNotOrdered(numer + i * denom, denom)


    def - (that: RationalNotOrdered): RationalNotOrdered =
        new RationalNotOrdered(
            numer * that.denom - that.numer * denom,
            denom * that.denom
        )
    def - (i: Int): RationalNotOrdered =
        new RationalNotOrdered(numer - i * denom, denom)


    def * (that: RationalNotOrdered): RationalNotOrdered =
        new RationalNotOrdered(numer * that.numer, denom * that.denom)

    def * (i: Int): RationalNotOrdered =
        new RationalNotOrdered(numer * i, denom)

    def / (that: RationalNotOrdered): RationalNotOrdered =
        new RationalNotOrdered(numer * that.denom, denom * that.numer)

    def / (i: Int): RationalNotOrdered =
        new RationalNotOrdered(numer, denom * i)

    def lessThan(that: RationalNotOrdered): Boolean =
        this.numer * that.denom < that.numer * this.denom

    def max(that: RationalNotOrdered): RationalNotOrdered =
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
