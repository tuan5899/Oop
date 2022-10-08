package Content3_Queue_Stack.BieuThucDung;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            Stack<Character>stk = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(!stk.isEmpty() && stk.peek() == '[' && s.charAt(i) == ']'){
                    stk.pop();
                }
                else stk.add(s.charAt(i));
            }
            int ngoact = 0, ngoacp = 0;
            while(!stk.isEmpty()){
                if(stk.peek() == '['){
                    ngoacp++;
                }
                else ngoact++;
                stk.pop();
            }
            System.out.println(ngoacp/2 + ngoact/2 + ngoact%2*2);
        }
    }
}
