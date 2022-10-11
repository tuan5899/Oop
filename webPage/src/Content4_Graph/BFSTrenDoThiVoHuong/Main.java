package Content4_Graph.BFSTrenDoThiVoHuong;

import java.util.*;

public class Main {
    public static ArrayList<Integer>edge[] = new ArrayList[10005];
    public static StringBuilder result;
    public static boolean check[] = new boolean[10005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            result = new StringBuilder("");
            int v = in.nextInt(), e = in.nextInt(), u = in.nextInt();
            for(int i = 0; i <= v; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 0; i < e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            result.append("BFS("+u+") = ");
            BFS(u);
            System.out.println();
            System.out.println(result.delete(result.length()-4,result.length()));
        }
    }

    private static void BFS(int u) {
        Queue<Integer>q = new LinkedList<>();
        q.add(u);
        check[u] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            result.append(v + " -> ");
            for(int i = 0; i < edge[v].size(); i++){
                int x = edge[v].get(i);
                if(check[x])q.add(x);
                check[x] = false;
            }
        }
    }
}
