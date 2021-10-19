public class Rectangle extends Square {
    private int width = 1;

    public Rectangle(int xcor, int ycor, int length, int width) {
        super(xcor, ycor, length);
        this.width = width;
    }

    public double rectangle_area() {
        return (this.width * length);
    }
}