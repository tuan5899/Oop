package Content3_Queue_Stack.SoBND1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            long n = in.nextInt();
            long dem = 0;
            Queue<String>q = new LinkedList<>();
            q.add("1");
            while(!q.isEmpty() && Long.parseLong(q.peek()) <= n){
                String temp = q.poll();
                dem++;
                q.add(temp + "0");
                q.add(temp + "1");
            }
            System.out.println(dem);
        }
    }
}
