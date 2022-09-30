package LoaiBoSoNguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String s = "C:\\Users\\tuanq\\IdeaProjects\\test1\\src\\LoaiBoSoNguyen\\test.txt";
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String>arrayList = new ArrayList<String>();
        while(in.hasNext()){
            String temp = in.next();
            try{
                int n = Integer.parseInt(temp);
            }catch (NumberFormatException e){
                arrayList.add(temp);
            }
        }
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String s1 : arrayList) {
            System.out.print(s1 + " ");
        }
    }
}
