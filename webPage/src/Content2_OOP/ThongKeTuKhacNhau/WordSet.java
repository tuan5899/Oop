package Content2_OOP.ThongKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {

    private TreeSet<String>str = new TreeSet<>();
    public WordSet(Scanner in){
        while(in.hasNextLine()){
            String s = in.nextLine();
            if(s.length() == 0) break;
            StringTokenizer temp = new StringTokenizer(s, " ");
            while(temp.hasMoreTokens()){
                str.add(temp.nextToken().toLowerCase().trim());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder("");
        str.forEach(item -> temp.append("\n" + item));
        return temp.toString();
    }
}
