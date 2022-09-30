package NhanVien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        NhanVien nv = new NhanVien(in.nextLine(),in.nextLine(),in.nextLine(),
                in.nextLine(),in.nextLine(),in.nextLine());
        System.out.println(nv.toString());
    }
}
