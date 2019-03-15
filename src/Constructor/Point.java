package Constructor;

/**
 * Created by LynnTeng on 2019/3/14.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double d1 = Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
        return d1;
    }

    public double distance(int x, int y) {
        double d2 = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return d2;
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}
