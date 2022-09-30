package SinhVien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhVien a = null;
        try {
            a = new SinhVien(in.nextLine(),in.nextLine(),in.nextFloat(),in.nextFloat(),in.nextFloat());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
    }
}
