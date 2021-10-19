public class Square {
    protected int xcor = 0;
    protected int ycor = 0;
    protected int length = 1;

    public Square() {}

    public Square(int xcor, int ycor, int length) {
        this.xcor = xcor;
        this.ycor = ycor;
        this.length = length;
    }

    public double diagonal_length(){
        return (Math.sqrt(2 * this.length * this.length));
    }
}

