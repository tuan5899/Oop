package Content3_Queue_Stack.NoiDay;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        long mod = (long)(10e8+7);
        while(test-->0){
            int n = in.nextInt();
            PriorityQueue<Long>q = new PriorityQueue<>();
            long result = 0;
            for(int i = 0; i < n; i++)q.add(in.nextLong());
            while(q.size() > 1){
                long temp = (q.poll() + q.poll())%mod;
                result = (result + temp) % mod;
                q.add(temp);
            }
            q.remove();
            System.out.println(result);
        }
    }
}
