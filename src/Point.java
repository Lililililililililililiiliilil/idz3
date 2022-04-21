public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(double x) {
        this.x = x;
        this.y = 0;
    }

    public void setY(double y){
        this.y = y;
    }

}
