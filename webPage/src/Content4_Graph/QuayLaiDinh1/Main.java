package Content4_Graph.QuayLaiDinh1;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[25];
    static boolean check[] = new boolean[25];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int n = in.nextInt(), m = in.nextInt();
            for(int i = 0; i <= n; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 0; i < m; i++){
                int a = in.nextInt(), b = in.nextInt();

            }
        }
    }
}
