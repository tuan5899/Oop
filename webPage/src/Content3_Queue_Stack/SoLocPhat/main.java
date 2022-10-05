package Content3_Queue_Stack.SoLocPhat;

import java.util.Scanner;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int length = Integer.parseInt(in.nextLine());
            Queue<String>result = new LinkedList<>();
            result.add("");
            StringBuilder ans = new StringBuilder("");
            long dem = 0;
            while(!result.isEmpty()){
                String temp = result.poll();
                if(temp.length() <= length && !temp.equals("")){
                    dem++;
                    ans.insert(0,temp + " ");
                }
                if(temp.length() < length){
                    result.add(temp + "6");
                    result.add(temp + "8");
                }
            }
            System.out.println(dem);
            System.out.println(ans);
        }
    }
}
