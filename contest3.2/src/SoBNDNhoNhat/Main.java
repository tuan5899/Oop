package SoBNDNhoNhat;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            BigInteger n = in.nextBigInteger();
            Queue<String>q = new LinkedList<>();
            q.add("1");
            while(!q.isEmpty()){
                String temp = q.poll();
                if(new BigInteger(temp).remainder(n).equals(BigInteger.ZERO)){
                    System.out.println(temp);
                    break;
                }
                q.add(temp + "0");
                q.add(temp + "1");
            }
        }
    }

}
