package Content4_Graph.DemThanhPhanLienThong;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[20005];
    static boolean check[] = new boolean[20005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt(), e = in.nextInt();
        for (int i = 0; i <= v; i++) {
            edge[i] = new ArrayList<>();
            check[i] = true;
        }
        for (int i = 0; i < e; i++) {
            int a = in.nextInt(), b = in.nextInt();
            edge[a].add(b);
            edge[b].add(a);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= v; i++) {
            init(v);
            check[i] = false;
            int dem = 0;
            for (int j = 1; j <= v; j++) {
                if (check[j]) {
                    BFS(j);
                    dem++;
                }
            }
            result.add(dem);
        }
        result.forEach(item -> System.out.println(item));
    }

    private static void BFS(int u) {
        Queue<Integer>q = new LinkedList<>();
        q.add(u);
        check[u] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            for(Integer x:edge[v]){
                if(check[x]){
                    q.add(x);
                    check[x] = false;
                }
            }
        }
    }

    private static void init(int v) {
        for(int i = 0; i <= v; i++){
            check[i] = true;
        }
    }
}
