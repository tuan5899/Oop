package Content2_OOP.TenVietTat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\Oop\\webPage\\src\\Content2_OOP\\file rar and text\\DanhSach.txt";
        Scanner in = new Scanner(new File("DANHSACH.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<TenVietTat>arrayList = new ArrayList<>();
        while(test-->0){
            TenVietTat temp = new TenVietTat(in.nextLine());
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<TenVietTat>() {
            @Override
            public int compare(TenVietTat o1, TenVietTat o2) {
                if(o1.getTen().compareTo(o2.getTen()) == 0){
                    return o1.getHo().compareTo(o2.getHo());
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        int testVietTat = Integer.parseInt(in.nextLine());
        while(testVietTat-->0){
            String tat = in.nextLine();
            arrayList.forEach(item ->{
                if(item.checkContains(tat)){
                    System.out.println(item);
                }
            });
        }
    }
}
