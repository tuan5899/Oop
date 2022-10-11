package Content4_Graph.DFSTrenDoThiVoHuong;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[1005];
    static StringBuilder result;
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            result = new StringBuilder("");
            int v = in.nextInt(), e = in.nextInt();
            int u = in.nextInt();
            for(int i = 0; i <= v; i++){
                check[i] = true;
                edge[i] = new ArrayList<>();
            }
            for(int i = 0; i < e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            result.append("DFS("+u+") = ");
            DFS(u);
            result.delete(result.length() - 4, result.length());
            System.out.println(result);
        }
    }

    private static void DFS(int u) {
        result.append(u + " -> ");
        check[u] = false;
        for(Integer v:edge[u]){
            if(check[v])DFS(v);
        }
    }
}
