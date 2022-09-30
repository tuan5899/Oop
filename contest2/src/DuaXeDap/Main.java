package DuaXeDap;

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
        ArrayList<DuaXeDap>arrayList = new ArrayList<DuaXeDap>();
        while(test-->0){
            DuaXeDap temp = new DuaXeDap(in.nextLine(),in.nextLine(),in.nextLine());
            arrayList.add(temp);
        }
        arrayList.sort(new Comparator<DuaXeDap>() {
            @Override
            public int compare(DuaXeDap o1, DuaXeDap o2) {
                if(o2.getVanToc().compareTo(o1.getVanToc()) == 0){
                    return 1;
                }
                else{
                    return o2.getVanToc().compareTo(o1.getVanToc());
                }
            }
        });
        arrayList.forEach(item -> System.out.println(item));
        System.out.println("54 Km/h".compareTo("54 Km/h"));
    }
}
