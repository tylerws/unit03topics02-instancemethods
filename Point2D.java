public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point2D other) {
        double distance = Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
        return distance;
    }

    public String toString() {
        String coords = ("(" + x + ", " + y + ")");
        return coords;
    }
    
    public static void main(String[] args) {
        for (int test = 0; test < 1; test++) {
            double randx = (Math.random()*10);
            double randy = (Math.random()*10);

            Point2D p1 = new Point2D(randx, randy);
            Point2D p2 = new Point2D(0, 0);
            System.out.println(p1);
            System.out.println(p2.distanceTo(p1));

        }
    }
}
