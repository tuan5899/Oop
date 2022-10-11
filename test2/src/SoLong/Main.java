package SoLong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test2\\src\\DATA.in";
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<Long>list = new ArrayList<>();
        String s = "";
        while(in.hasNext()){
            try{
                s = in.next();
                int test = Integer.parseInt(s);
            }catch (NumberFormatException e){
                try {
                    long temp = Long.parseLong(s);
                    list.add(temp);
                }catch (NumberFormatException n){
                    continue;
                }
            }
        }
        long result = 0;
        for(int i = 0; i < list.size(); i++){
            result += list.get(i);
        }
        System.out.println(result);
    }
}
