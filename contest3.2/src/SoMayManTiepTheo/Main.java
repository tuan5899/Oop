package SoMayManTiepTheo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long right = in.nextLong(),left = in.nextLong();
        Queue<String>q = new LinkedList<>();
        long result = 0;
        q.add("4");
        q.add("7");
        while(Long.parseLong(q.peek()) < right){
            String temp = q.poll();
            q.add(temp + "4");
            q.add(temp + "7");
        }
//        for(long i = right; i < left;){
//            long temp = Long.valueOf(q.peek());
//            if(temp <= i){
//                String s = q.poll();
//                temp = Long.valueOf(q.peek());
//                q.add(s+"4");
//                q.add(s+"7");
//            }
//            result = result  + temp*(temp-i + 1);
//            i = temp;
//        }
//        System.out.println(Math.abs(result - Long.valueOf(q.peek())));
        long lastValue = 0;
        long khoang;
        long firstValue = Long.valueOf(q.peek());
        if(Long.valueOf(q.peek()) != right) khoang = Long.valueOf(q.peek()) - right;
        else khoang = right;
        while(Long.valueOf(q.peek()) <= left){
            lastValue = Long.valueOf(q.peek());
            result = result + Long.valueOf(q.peek())*(Long.valueOf(q.peek()) - khoang);
            khoang = Long.valueOf(q.peek());
            String s = q.poll();
            q.add(s+"4");
            q.add(s+"7");
        }
        if(lastValue != left){
            result += Long.parseLong(q.peek())*(left - lastValue);
        }
        System.out.println(result + firstValue);
    }
}
