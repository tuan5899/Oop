package Content3_Queue_Stack.BienDoiTienToHauTo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            Stack<String>stk = new Stack<>();
            for(int i = s.length() - 1; i >= 0; i--){
                if(s.charAt(i) == '+'||s.charAt(i) == '-'||s.charAt(i) == '*'||s.charAt(i) == '/'){
                    String first = stk.peek(); stk.pop();
                    String second = stk.peek(); stk.pop();
                    stk.push(first + second + s.charAt(i));
                }
                else stk.push(Character.toString(s.charAt(i)));
            }
            System.out.println(stk.peek());
        }
    }
}
