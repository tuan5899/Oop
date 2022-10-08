package Content3_Queue_Stack.DoanLienTiep;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) array[i] = in.nextInt();
            Stack<Integer>stk = new Stack<>();
            int[] result = new int[n];
            for(int i = 0; i < n; i++){
                int dem = 1;
                while(!stk.isEmpty() && stk.peek() >= 0 && array[stk.peek()] <= array[i]){
                    stk.pop();
                }
                if(stk.isEmpty()) stk.push(-1);
                result[i] = i - stk.peek();
                stk.push(i);
            }
            for(int i = 0; i < n; i++) System.out.print(result[i] + " ");
            System.out.println();
        }
    }
}
