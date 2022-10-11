package SoKhongGiam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

public class SoKhongGiam {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        int[] d1 = new int[10000];
        int[] d2 = new int[10000];
        ArrayList<Integer>arrayList1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer>arrayList2 = (ArrayList<Integer>) in2.readObject();
        arrayList1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        arrayList1.forEach(item->{
            d1[item]++;
        });
        arrayList2.forEach(item->{
            d2[item]++;
        });
        arrayList2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
//        arrayList1.forEach(i)
    }

    private static boolean checkTang(Integer item) {
        while(item != 0){
            int temp = item % 10;
            item /= 10;
            if(temp < item %10){
                return false;
            }
        }
        return true;
    }
}
