package Content3_Queue_Stack.SuaLaiDayNgoac;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            Stack<String>result = new Stack<>();
            String s = in.nextLine();
            int dem = 0;
            for(int i = 0; i < s.length(); i++){
                if(!result.isEmpty() && result.peek().equals("(") && Character.toString(s.charAt(i)).equals(")")){
                    result.pop();
                }
                else result.add(Character.toString(s.charAt(i)));
            }
            int ngoact = 0,ngoacp = 0;
            while(!result.isEmpty()){
                if(result.peek().equals(")")){
                    ngoact++;
                }
                else{
                    ngoacp++;
                }
                result.pop();
            }
            System.out.println(ngoacp/2 + ngoact/2 + ngoact%2*2);
        }
    }
}
