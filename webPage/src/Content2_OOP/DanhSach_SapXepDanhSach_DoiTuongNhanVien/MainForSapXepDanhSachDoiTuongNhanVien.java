package Content2_OOP.DanhSach_SapXepDanhSach_DoiTuongNhanVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainForSapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien>list = new ArrayList<>();
        while(test-->0) {
            NhanVien nv = new NhanVien(in.nextLine(), in.nextLine(), in.nextLine(),
                    in.nextLine(), in.nextLine(), in.nextLine());
            list.add(nv);
        }
        list.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
            }
        });
        list.forEach(item-> System.out.println(item));
    }
}
