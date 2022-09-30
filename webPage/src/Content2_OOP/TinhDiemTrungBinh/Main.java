package TinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\Oop\\webPage\\src\\file rar and text\\BANGDIEM.txt";
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<TinhDiem>arrayList = new ArrayList<>();
        while(test-->0){
            TinhDiem temp = new TinhDiem(in.nextLine(),Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<TinhDiem>() {
            @Override
            public int compare(TinhDiem o1, TinhDiem o2) {
                if(Float.compare(o2.getDiem(),o1.getDiem())==0){
                    return o1.getMaSV().compareTo(o2.getMaSV());
                }
                return Float.compare(o2.getDiem(),o1.getDiem());
            }
        });
        int xepHang = 1;
        for(int i = 0; i < arrayList.size(); i++){
            if(i >= 1 && Float.compare(arrayList.get(i - 1).getDiem(),arrayList.get(i).getDiem()) == 0){
                arrayList.get(i).setXepHang(arrayList.get(i-1).getXepHang());
            }
            else{
                xepHang = i + 1;
                arrayList.get(i).setXepHang(xepHang);
            }
        }
        arrayList.forEach(item -> System.out.println(item));
    }
}
