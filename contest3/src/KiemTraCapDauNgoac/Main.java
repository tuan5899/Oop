package KiemTraCapDauNgoac;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            boolean check = true;
            Stack<Character>stk = new Stack<>();
            for(int i = 0; i < s.length();i++){
                if(s.charAt(i) == '['||s.charAt(i) == '('||s.charAt(i) == '{'){
                    stk.push(s.charAt(i));
                }
                else{
                    if(!stk.isEmpty()) {
                        if (stk.peek() == '[' && s.charAt(i) == ']') {
                            stk.pop();
                        } else if (stk.peek() == '{' && s.charAt(i) == '}') {
                            stk.pop();
                        } else if (stk.peek() == '(' && s.charAt(i) == ')') {
                            stk.pop();
                        }
                        else{
                            check = false;
                            break;
                        }
                    }else{
                        check = false;
                        break;
                    }
                }
            }
            if(!stk.isEmpty()) check = false;
            if(check) System.out.println(true);
            else System.out.println(false);
        }
    }
}
