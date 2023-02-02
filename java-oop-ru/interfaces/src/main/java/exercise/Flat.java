package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;
    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + floor + " этаже";
    }
    public double getArea() {
        return (area + balconyArea);
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
