package Content3_Queue_Stack.PhanTuBenPhaiDauTienLonHon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) array[i] = in.nextInt();
            int[] result = new int[n];
            Stack<Integer>stk = new Stack<>();
            for(int i = n-1; i >= 0; i--){
                while(!stk.isEmpty() && stk.peek() <= array[i]) stk.pop();
                if(stk.isEmpty())result[i] = -1;
                else result[i] = stk.peek();
                stk.push(array[i]);
            }
            for(int i = 0; i < n; i++) System.out.print(result[i] + " ");
            System.out.println();
        }
    }
}
