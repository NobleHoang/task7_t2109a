import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
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
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    public int[] getXY(int x,int y){
        return new int[]{x, y};        //lam test
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
        //lam test
    }
    public double distance(int x, int y){
        double a = sqrt(pow((this.x - x), 2) + pow((this.y - y), 2));
        return a;
    }
    public double distance(Point another){
        double a = sqrt(pow((this.x - another.getX()), 2) + pow((this.y - another.getY()), 2));
        return a;
    }
    public double distance(){
        double a = sqrt(pow((this.x), 2) + pow((this.y), 2));
        return a;
    };
}
