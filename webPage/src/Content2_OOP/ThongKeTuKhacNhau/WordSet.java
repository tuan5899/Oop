package Content2_OOP.ThongKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> str = new TreeSet<String>();
    public WordSet(Scanner in){
        while(in.hasNextLine()){
            System.out.println(in.hasNextLine());
            in.nextLine();
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder("");
        str.forEach(item -> temp.append("\n" + item));
        return str.toString();
    }
}
