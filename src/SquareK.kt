import kotlin.math.sqrt

open class SquareK (xcor: Int, ycor: Int, length: Int){
    protected var xcor = 0
    protected var ycor = 0
    protected var length = 1

    init {
        this.xcor = xcor
        this.ycor = ycor
        this.length = length
    }

    open fun diagonalLength(): Double {
        return sqrt((2 * this.length * this.length).toDouble())
    }
}


