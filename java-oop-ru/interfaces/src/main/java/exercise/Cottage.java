package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }
    public double getArea() {
        return area;
    }
    public int compareTo(Home another) {
        double anotherArea = another.getArea();
        if (area > anotherArea) {
            return 1;
        } else if (area == anotherArea) {
            return 0;
        }
        return -1;
    }
}
// END
