package Content3_Queue_Stack.GiaTriNhoNhatCuaXau;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            PriorityQueue<Long>q = new PriorityQueue<>(Collections.reverseOrder());
            int k = Integer.parseInt(in.nextLine());
            long[] a = new long[50];
            for(int i = 0; i < 50; i++) a[i] = 0;
            String s = in.nextLine();
            for(int i = 0; i < s.length(); i++) a[s.charAt(i) - '0']++;
            for(int i = 0; i < 50; i++) if(a[i] != 0)q.add(a[i]);
            while(k-->0){
                long temp = q.poll();
                temp--;
                q.add(temp);
            }
            long result = 0;
            while(!q.isEmpty()){
                result += q.peek()*q.peek();
                q.remove();
            }
            System.out.println(result);
        }
    }
}
