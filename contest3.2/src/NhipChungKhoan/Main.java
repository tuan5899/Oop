package NhipChungKhoan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int n = in.nextInt();
            int[]array = new int[n];
            int[]res = new int[n];
            for(int i = 0; i < n; i++)array[i] = in.nextInt();
            Stack<Integer>stk = new Stack<>();
            for(int i = 0; i < n; i++){
                while(!stk.isEmpty() && stk.peek() >= 0 && array[Math.abs(stk.peek())] <= array[i]){
                    stk.pop();
                }
                if(stk.isEmpty())stk.push(-1);
                res[i] = i - stk.peek();
                stk.push(i);
            }
            for(int i = 0; i < n; i++)System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
