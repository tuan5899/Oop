package SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        ArrayList<GiangVien>arrayList = new ArrayList<>();
        while(test-->0){
            GiangVien temp = new GiangVien(in.nextLine(), in.nextLine());
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                if(o1.getTen().compareTo(o2.getTen()) == 0){
                    return o1.getMaGV().compareTo(o2.getMaGV());
                }
                else return o1.getTen().compareTo(o2.getTen());
            }
        });
        arrayList.forEach(item -> System.out.println(item));
    }
}
