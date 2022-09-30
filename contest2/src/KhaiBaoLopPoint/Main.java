package KhaiBaoLopPoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            Point p1 = new Point(in.nextDouble(),in.nextDouble());
            Point p2 = new Point(in.nextDouble(),in.nextDouble());
            System.out.println(String.format("%.4f",p1.distance(p2)));
        }
    }
}
