import java.util.Arrays;

public class Line {
    Point begin;
    Point end;

        public Line(int x1, int y1, int x2, int y2) {
            begin= new Point(x1,y1);
            end=new Point(x2,y2);
        }
        public Line(Point begin, Point end){
            this.begin=begin;
            this.end=end;
        }
        public Point getBegin(){
            return begin;
        }
        public Point getEnd(){
            return end;
        }
        public void setBegin(Point begin) {
            this.begin = begin;
        }
        public void setEnd(Point end) {
            this.end = end;
        }
        public int getBeginX(){
            return begin.getX();
        }
        public void setBeginX(int x){
            begin.setX(x);
        }
        public int getBeginY(){
            return begin.getY();
        }
        public void setBeginY(int y){
            begin.setY(y);
        }
        public int[] getBeginXY(){
            return begin.getXY(begin.getX(), begin.getY());
            //test
        }
        public void setBeginXY(int x, int y){
             begin.setXY(x,y);
        }
        public int getEndX(){
            return end.getX();
        }
        public void setEndX(int x){
            end.setX(x);
        }
        public int getEndY(){
            return end.getY();
        }
        public void setEndY(int y){
            end.setY(y);
        }
        public int[] getEndXY(){
            return end.getXY(end.getX(), end.getY());
            //test
        }
        public void setEndXY(int x,int y){
            end.setXY(x,y);
        }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
    public double getLength(){
            return begin.distance();
    }
    public double getLength(int x, int y){
            return begin.distance(x, y);
    }
    public double getLength(Point N){
            return begin.distance(N);
    }
    public static void main(String[] args) {
        Line line=new Line(3,6,3,8);
        System.out.println(line);
        Line line1=new Line(6,3,6,8);
        System.out.println(line1);
        line.setBegin(new Point(5,5));
        line.setEnd(new Point(9,9));
        System.out.println(line);
        System.out.println("Begin is: "+line.getBegin());
        System.out.println("End is: "+line.getEnd());
        line.setBeginX(99);
        line.setBeginY(88);
        line.setEndX(66);
        line.setEndY(33);
        System.out.println(line);
        System.out.println("Begin X is: "+line.getBeginX());
        System.out.println("End X is: "+line.getEndX());
        System.out.println("Begin Y is: "+line.getBeginY());
        System.out.println("End Y is: "+line.getEndY());
        line.setBeginXY(63,68);
        line.setEndXY(36,38);
        System.out.println(line);
        System.out.println("New Begin is: "+ Arrays.toString(line.getBeginXY()));
        System.out.println("New End is: "+ Arrays.toString(line.getEndXY()));
        System.out.println("New length from begin to (0,0) is: "+ line.getLength());
        System.out.println("New length from begin to (x,y): "+line.getLength(6,8));
        System.out.println("New Length from begin to Point: "+line.getLength(new Point(5,6)));
    }
}

