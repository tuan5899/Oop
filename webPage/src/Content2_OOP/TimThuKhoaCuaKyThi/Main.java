package Content2_OOP.TimThuKhoaCuaKyThi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        SinhVien a = null;
        ArrayList<SinhVien>list = new ArrayList<>();
        while(test-->0){
            SinhVien temp = new SinhVien(in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),
                    Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            list.add(temp);
        }
        if(list.size() > 0) {
            list.sort(new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    if(Float.compare(o2.getTongDiem(),o1.getTongDiem()) == 0){
                        return Integer.compare(o1.getMaSV(),o2.getMaSV());
                    }
                    return Float.compare(o2.getTongDiem(),o1.getTongDiem());
                }
            });
            Float diemThuKhoa = list.get(0).getTongDiem();
            list.forEach(item -> {
                if (item.getTongDiem() == diemThuKhoa) {
                    System.out.println(item);
                }
            });
        }
    }
}
