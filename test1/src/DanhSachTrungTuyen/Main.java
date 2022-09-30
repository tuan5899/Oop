package DanhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test1\\src\\file rar and text\\ThiSinh.txt";
        Scanner in = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> arrayList = new ArrayList<>();
        for(int i = 0; i < t; i++){
            ThiSinh temp = new ThiSinh(in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),
                    Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            arrayList.add(temp);
        }
        int pass = Integer.parseInt(in.nextLine());
        arrayList.sort(new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return Double.compare(Double.parseDouble(o2.getdTong()),Double.parseDouble(o1.getdTong()));
            }
        });
        String dTrungTuyen;
        if(t > pass) {
            dTrungTuyen = String.format("%.1f", Float.parseFloat(arrayList.get(pass - 1).getdTong()));
        }
        else{
            dTrungTuyen = String.format("%.1f", Float.parseFloat(arrayList.get(arrayList.size() - 1).getdTong()));
        }
        arrayList.forEach(item -> {
            if(Float.parseFloat(dTrungTuyen) - Float.parseFloat(item.getdTong()) > 0){
                item.setTrangThai("TRUOT");
            }
            else{
                item.setTrangThai("TRUNG TUYEN");
            }
        });
        System.out.println(dTrungTuyen);
        arrayList.forEach(item -> System.out.println(item));
    }
}
