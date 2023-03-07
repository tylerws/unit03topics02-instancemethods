public class Circle {
    private double r;
    private Point2D center;

    public Circle(double radius, Point2D centerPoint) {
        r = radius;
        center = centerPoint;
    }

    public double getArea() {
        double area = (3.14 * Math.pow(r, 2));
        return area;
    }

    public double getCircumference() {
        double circumference = (2 * 3.14 * r);
        return circumference;
    }

    public boolean intersects(Circle other) {
        if (center.distanceTo(other.center) <= r + other.r) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Circle other) {
        if (center.distanceTo(other.center) <= other.r - r) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
    }

}
