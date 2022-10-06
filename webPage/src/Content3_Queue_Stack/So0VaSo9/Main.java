package Content3_Queue_Stack.So0VaSo9;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            BigInteger n = new BigInteger(in.nextLine());
            Queue<String>q = new LinkedList<>();
            q.add("9");
            while(!q.isEmpty()){
                if(new BigInteger(q.peek()).remainder(n).compareTo(BigInteger.ZERO) == 0){
                    System.out.println(q.poll());
                    break;
                }
                String temp = q.poll();
                q.add(temp + "0");
                q.add(temp + "9");
            }
        }
    }
}
