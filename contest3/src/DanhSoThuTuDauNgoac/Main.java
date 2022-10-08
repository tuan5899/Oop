package DanhSoThuTuDauNgoac;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String s = in.nextLine();
            Stack<Integer>stk = new Stack<>();
            int dem = 1;
            String result = "";
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    stk.push(dem);
                    result = result + dem + " ";
                    dem++;
                }
                else if(s.charAt(i) == ')'){
                    String temp = String.valueOf(stk.pop());
                    result += temp + " ";
                }
            }
            System.out.println(result);
        }
    }
}
