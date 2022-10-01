package Content2_OOP.SoNguyenToTrongFileNhiPhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arrayList = (ArrayList<Integer>) sc.readObject();
        int[] a = new int[10000];
        for(Integer i: arrayList){
            a[i]++;
        }
        for(int i = 2;i<10000;i++){
            if(checkSNT(i)){
                if(a[i]>0){
                    System.out.println(i + " " + a[i]);
                }
            }
        }
    }

    private static boolean checkSNT(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
