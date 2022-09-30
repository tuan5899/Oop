package SoNguyenToTrongFileNhiPhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static int[] a = new int[10005];
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < 10005;i++){
            list.add(0);
            a[i] = 0;
        }
        checkPrime();
        try {
            FileInputStream input = new FileInputStream("SONGUYEN.in");
            int temp = 0;
            while((temp = input.read()) != -1) {
                if(a[temp] == 0) {
                    list.set(temp, list.get(temp) + 1);
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != 0) System.out.println(i + " " + list.get(i));
        }
    }

    private static void checkPrime() {
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i*i <= 10000; i++){
            if(a[i] == 0){
                for(int j = i*i; j <= 10000; j += i){
                    a[i] = 1;
                }
            }
        }
    }

}
