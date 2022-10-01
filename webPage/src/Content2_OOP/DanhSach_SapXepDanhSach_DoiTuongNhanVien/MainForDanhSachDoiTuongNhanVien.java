package Content2_OOP.DanhSach_SapXepDanhSach_DoiTuongNhanVien;

import java.text.ParseException;
import java.util.Scanner;

public class MainForDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0) {
            NhanVien nv = new NhanVien(in.nextLine(), in.nextLine(), in.nextLine(),
                    in.nextLine(), in.nextLine(), in.nextLine());
            System.out.println(nv.toString());
        }
    }
}
