package SoKhacNhauTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        URL url = Main.class.getResource("TEST123.txt");
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < 1005; i++){
            array.add(0);
        }
        while(in.hasNext()){
            String s = in.next();
            int n = Integer.parseInt(s);
            int value = array.get(n) + 1;
            array.set(n,value);
        }
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) != 0) {
                System.out.println(i + " " + array.get(i));
            }
        }
    }
}
