package Content2_OOP.DangKyHinhThucGiangDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\Oop\\webPage\\src\\Content2_OOP\\file rar and text\\Monhoc.txt";
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc>list = new ArrayList<>();
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            MonHoc temp = new MonHoc(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),
                    in.nextLine(),in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMaMon().compareTo(o2.getMaMon());
            }
        });
        list.forEach(item-> {
            if(item.getHinhThucDayTH().contains("Truc tuyen") ||
                    item.getHinhThucDayTH().contains(".ptit.edu.vn")){
                System.out.println(item);
            }
        });
    }
}
