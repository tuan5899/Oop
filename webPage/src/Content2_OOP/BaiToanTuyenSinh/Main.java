package Content2_OOP.BaiToanTuyenSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TuyenSinh sv = new TuyenSinh(in.nextLine(),in.nextLine(),
                Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()),
                Float.parseFloat(in.nextLine()));
        System.out.println(sv);
    }
}

