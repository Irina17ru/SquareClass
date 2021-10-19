class RectangleK(xcor: Int, ycor: Int, length: Int, width: Int) : Square(xcor, ycor, length) {
    private var width = 1

    init {
        this.width = width
    }

    fun rectangleArea(): Double {
        return (this.width * length).toDouble()
    }
}