package KhaiBaoLopPoint;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            Point p1 = new Point(in.nextDouble(),in.nextDouble());
            Point p2 = new Point(in.nextDouble(),in.nextDouble());
            Point p3 = new Point(in.nextDouble(),in.nextDouble());
            if(p1.distance(p2) + p2.distance(p3) <= p3.distance(p1) ||
                    p1.distance(p3) + p3.distance(p2) <= p1.distance(p2) ||
                    p3.distance(p1) + p1.distance(p2) <= p2.distance(p3)){
                System.out.println("INVALID");
            }else {
                System.out.println(String.format("%.3f",p1.distance(p2) + p2.distance(p3) + p3.distance(p1)));
            }
        }
    }
}
