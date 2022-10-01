package Content2_OOP.ThoiGianOnlineLienTuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\Oop\\webPage\\src\\Content2_OOP\\file rar and text\\Online.txt";
        Scanner in = new Scanner(new File("ONLINE.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<ThoiGianOnl>list = new ArrayList<>();
        while(test-->0){
            ThoiGianOnl temp = new ThoiGianOnl(in.nextLine(),in.nextLine(),in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<ThoiGianOnl>() {
            @Override
            public int compare(ThoiGianOnl o1, ThoiGianOnl o2) {
                return Integer.compare(o2.getThoiGianOnl(),o1.getThoiGianOnl());
            }
        });
        list.forEach(item -> System.out.println(item));
    }
}
