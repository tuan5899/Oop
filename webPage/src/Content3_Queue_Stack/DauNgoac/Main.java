package Content3_Queue_Stack.DauNgoac;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int dem = 1;
            String s = in.nextLine();
            Stack<Integer>stk = new Stack<>();
            StringBuilder result = new StringBuilder("");
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    stk.push(dem);
                    result.append(dem + " ");
                    dem++;
                }
                else if(s.charAt(i) == ')'){
                    result.append(stk.peek() + " ");
                    stk.pop();
                }
            }
            System.out.println(result);
        }
    }
}
