package Content3_Queue_Stack.TinhGiaTriBieuThucHauTo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            Stack<Integer>stk = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '*'||s.charAt(i) == '/'||s.charAt(i) == '+'||s.charAt(i) == '-'){
                    int fiNum  = stk.pop();
                    int seNum = stk.pop();
                    switch (s.charAt(i)){
                        case '*':
                            stk.push(fiNum*seNum);
                            break;
                        case '/':
                            stk.push(seNum/fiNum);
                            break;
                        case '+':
                            stk.push(seNum+fiNum);
                            break;
                        case '-':
                            stk.push(seNum-fiNum);
                            break;
                    }
                }
                else stk.push(Integer.parseInt(Character.toString(s.charAt(i))));
            }
            System.out.println(stk.pop());
        }
    }
}
