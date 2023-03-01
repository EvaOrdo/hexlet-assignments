package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point p, int rad) {
        this.point = p;
        this.radius = rad;
    }

    public int getRadius() {
        return  radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw  new NegativeRadiusException("");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
// END
