package LuyenTapLapTrinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test2\\src\\LuyenTapLapTrinh\\LUYENTAP.txt";
        Scanner in = new Scanner(new File("LUYENTAP.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<LuyenTapLapTrinh>list = new ArrayList<LuyenTapLapTrinh>();
        while(test-->0){
            LuyenTapLapTrinh temp = new LuyenTapLapTrinh(in.nextLine(), in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<LuyenTapLapTrinh>() {
            @Override
            public int compare(LuyenTapLapTrinh o1, LuyenTapLapTrinh o2) {
                if(Long.compare(o1.getBaiLamDung(),o2.getBaiLamDung()) == 0){
                    if(Long.compare(o1.getSoLanSub(),o2.getSoLanSub()) == 0){
                        return o1.getTen().compareTo(o2.getTen());
                    }
                    return Long.compare(o1.getSoLanSub(),o2.getSoLanSub());
                }
                return Long.compare(o2.getBaiLamDung(),o1.getBaiLamDung());
            }
        });
        list.forEach(item -> System.out.println(item));
    }
}
