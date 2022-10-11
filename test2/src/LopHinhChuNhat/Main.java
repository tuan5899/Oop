package LopHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectange temp = new Rectange(in.nextDouble(),in.nextDouble(),in.next());
        if(temp.getWidth()%1 == 0 && temp.getHeith()%1==0 && temp.getHeith() > 0 && temp.getWidth() > 0){
            System.out.println((int)temp.findPerimeter()+" "+(int)temp.findArea()+" "+temp.getColor());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
