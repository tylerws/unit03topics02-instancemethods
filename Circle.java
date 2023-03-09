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
        if ((center.distanceTo(other.center) <= r + other.r) && 
        (center.distanceTo(other.center) >= Math.abs(r - other.r))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Circle other) {
        if ((other.r >= r) && 
        (center.distanceTo(other.center) + r <= other.r)) {
            return true;
        } else {
            // System.out.println(center.distanceTo(other.center));
            // System.out.println("r: " + r);
            // System.out.println("other r: " + other.r);
            return false;
        }
    }
    
    public String toString() {
        String circleFormat = "radius: " + r + "  centerpoint: " + center;
        return circleFormat;
    }

    public static void main(String[] args) {
        Point2D center1 = new Point2D(0, 0);
        Point2D center2 = new Point2D(0, 0);

        Circle c1 = new Circle(1, center1);
        Circle c2 = new Circle(2, center2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.intersects(c2));
        System.out.println(c1.contains(c2));

        //System.out.println(center1.distanceTo(center2));
    }

}
