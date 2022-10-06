package Content3_Queue_Stack.KiemTraBieuThucSoHoc;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            Stack<Integer>result = new Stack<>();
            boolean check = false;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(')result.push(i);
                else if(s.charAt(i) == ')'){
                    int j = result.peek();
                    result.pop();
                    if(i - j == 2){
                        check = true;
                        break;
                    }
                    if(s.charAt(j+1) == '(' && s.charAt(i - 1) == ')'){
                        check = true;
                        break;
                    }
                }
            }
            if(!check) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
