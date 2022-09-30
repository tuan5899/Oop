package SapXepDanhSachSinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien>list = new ArrayList<>();
        while(t-->0){
            SinhVien temp = new SinhVien(in.nextLine(),in.nextLine(),
                    in.nextLine(),in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getTen().compareTo(o2.getTen()) == 0){
                    if(o1.getHo().compareTo(o2.getHo()) == 0){
                        return o1.getDem().compareTo(o2.getDem());
                    }
                    return o1.getHo().compareTo(o2.getHo());
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        list.forEach(item -> {
            System.out.println(item.getTen());
            System.out.println(item.getHo());
            System.out.println(item.getDem());
            System.out.println(item);
        });
    }
}
