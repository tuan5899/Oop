package Content2_OOP.TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        ArrayList<TinhGio>list = new ArrayList<>();
        while(test-->0){
            TinhGio temp = new TinhGio(in.nextLine(),in.nextLine(),
                    in.nextLine(),in.nextLine());
            list.add(temp);
        }
        list.sort(new Comparator<TinhGio>() {
            @Override
            public int compare(TinhGio o1, TinhGio o2) {
                return Long.compare(o2.getTongGioChoi(),o1.getTongGioChoi());
            }
        });
        list.forEach(item -> System.out.println(item));
    }
}
