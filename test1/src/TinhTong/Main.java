package TinhTong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long kq = 0;
        while(in.hasNext()){
            String s = in.next();
            try {
                int n = Integer.parseInt(s);
                kq += n;
            }
            catch (NumberFormatException e){
                continue;
            }
        }
        System.out.println(kq);
    }
}
