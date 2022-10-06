package Content3_Queue_Stack.SoNhiPhanTu1DenN;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int n = in.nextInt();
            Queue<String>q = new LinkedList<>();
            q.add("1");
            while(n-->0){
                String temp = q.poll();
                System.out.print(temp + " ");
                q.add(temp + "0");
                q.add(temp + "1");
            }
            System.out.println();
        }
    }
}
