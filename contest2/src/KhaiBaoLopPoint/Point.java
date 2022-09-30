package KhaiBaoLopPoint;

import java.security.cert.PolicyNode;

public class Point {
    private Double x, y;

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public Double distance(Point point){
        return Math.sqrt((x-point.x)*(x-point.x) + (y-point.y)*(y-point.y));
    }

    public Double distance(Point point1, Point point2){
        Double result = Math.sqrt((point2.x-point1.x)*(point2.x-point1.x) + (point2.y-point1.y)*(point2.y-point1.y));
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
