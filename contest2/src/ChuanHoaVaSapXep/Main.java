package ChuanHoaVaSapXep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\contest\\src\\TextFile\\DANHSACH.txt";
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<ChuanHoaVaSapXep>arrayList = new ArrayList<ChuanHoaVaSapXep>();
        while(in.hasNextLine()){
            ChuanHoaVaSapXep temp = new ChuanHoaVaSapXep(in.nextLine());
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<ChuanHoaVaSapXep>() {
            @Override
            public int compare(ChuanHoaVaSapXep o1, ChuanHoaVaSapXep o2) {
                if(o1.getLastName().compareTo(o2.getLastName()) == 0){
                    if(o1.getFirstName().compareTo(o2.getFirstName()) == 0){
                        return o1.getMiddleName().compareTo(o2.getMiddleName());
                    }
                    else{
                        return o1.getFirstName().compareTo(o2.getFirstName());
                    }
                }
                else{
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            }
        });
        arrayList.forEach(item -> System.out.println(item));
    }
}
