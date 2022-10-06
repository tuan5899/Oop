package Content3_Queue_Stack.BienDoiHauToTienTo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            Stack<String>stk = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '+'||s.charAt(i) == '-'||s.charAt(i) == '*'||s.charAt(i) == '/'){
                    String first = stk.pop();
                    String second = stk.pop();
                    stk.push(s.charAt(i) + second + first);
                }
                else stk.push(Character.toString(s.charAt(i)));
            }
            System.out.println(stk.pop());
        }
    }
}
