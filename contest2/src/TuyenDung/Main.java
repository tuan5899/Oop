package TuyenDung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\contest\\src\\TextFile\\TuyenDung.txt";
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        ArrayList<TuyenDung>arrayList = new ArrayList<TuyenDung>();
        while(test-->0){
            TuyenDung temp = new TuyenDung(in.nextLine(),Float.parseFloat(in.nextLine())
                    ,Float.parseFloat(in.nextLine()));
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<TuyenDung>() {
            @Override
            public int compare(TuyenDung o1, TuyenDung o2) {
                return o1.getDiem() > o2.getDiem() ? -1 : 1;
            }
        });
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getDiem() < (float)5){
                arrayList.get(i).setTrangThai("TRUOT");
            } else if (arrayList.get(i).getDiem() < (float) 8 && arrayList.get(i).getDiem() >= (float)5) {
                arrayList.get(i).setTrangThai("CAN NHAC");
            }
            else if (arrayList.get(i).getDiem() <= (float) 9.5 && arrayList.get(i).getDiem() >= (float)8) {
                arrayList.get(i).setTrangThai("DAT");
            }
            else if(arrayList.get(i).getDiem() > (float)9.5){
                arrayList.get(i).setTrangThai("XUAT SAC");
            }
        }
        arrayList.forEach(item -> System.out.println(item));
    }
}
