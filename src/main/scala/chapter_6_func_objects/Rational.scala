package chapter_6_func_objects

class Rational(n: Int, d: Int) {

    require(d != 0)
    println("Created " + n + "/" + d)

    private val g = greatestCommonDivisor(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1) // auxiliary constructor


    def + (that: Rational): Rational =
        new Rational(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )

    def + (i: Int): Rational =
        new Rational(numer + i * denom, denom)


    def - (that: Rational): Rational =
        new Rational(
            numer * that.denom - that.numer * denom,
            denom * that.denom
        )
    def - (i: Int): Rational =
        new Rational(numer - i * denom, denom)


    def * (that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)

    def * (i: Int): Rational =
        new Rational(numer * i, denom)

    def / (that: Rational): Rational =
        new Rational(numer * that.denom, denom * that.numer)

    def / (i: Int): Rational =
        new Rational(numer, denom * i)

    def lessThan(that: Rational): Boolean =
        this.numer * that.denom < that.numer * this.denom

    def max(that: Rational): Rational =
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
