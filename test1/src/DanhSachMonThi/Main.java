package DanhSachMonThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test1\\src\\file rar and text\\Monhoc.txt";
        Scanner in = new Scanner(new File("MONHOC.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<DanhSachMonThi>arrayList = new ArrayList<DanhSachMonThi>();
        while(test-->0){
            DanhSachMonThi ds = new DanhSachMonThi(in.nextLine(), in.nextLine(), in.nextLine());
            arrayList.add(ds);
        }
        arrayList.sort(new Comparator<DanhSachMonThi>() {
            @Override
            public int compare(DanhSachMonThi m1, DanhSachMonThi m2) {
                return m1.getMaMon().compareTo(m2.getMaMon());
            }
        });
        arrayList.forEach(item -> System.out.println(item));
    }
}
