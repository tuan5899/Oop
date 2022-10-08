package SoNguyenThuy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            Queue<String> q = new LinkedList<>();
            int n = in.nextInt();
            q.add("4");
            q.add("5");
            int dem = 0;
            StringBuilder result = new StringBuilder("");
            while(n-->0){
                String s1 = q.peek();
                String s2 = q.peek();
                q.poll();
                q.add(s1 + "4");
                q.add(s2 + "5");
                StringBuilder str = new StringBuilder(s2);
                System.out.print(s1+str.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
