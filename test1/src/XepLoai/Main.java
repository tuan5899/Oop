package XepLoai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test1\\src\\file rar and text\\BANGDIEM.txt";
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<XepLoai>arrayList = new ArrayList<XepLoai>();
        while(t-->0){
            XepLoai sv = new XepLoai(in.nextLine(),Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            arrayList.add(sv);
        }
        arrayList.sort(new Comparator<XepLoai>() {
            @Override
            public int compare(XepLoai o1, XepLoai o2) {

                return o2.getDiemTongK().compareTo(o1.getDiemTongK());
            }
        });
        arrayList.forEach(item -> System.out.println(item));
    }
}
