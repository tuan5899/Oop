package ThanhPhanLienThong2;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[20005];
    static boolean check[] = new boolean[20005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt(), e = in.nextInt();
        for(int i = 0; i <= v; i++){
            check[i] = true;
            edge[i] = new ArrayList<>();
        }
        for(int i = 1; i <= e; i++){
            int a = in.nextInt(), b = in.nextInt();
            edge[a].add(b);
            edge[b].add(a);
        }
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = 1; i <= v; i++){
            init(v);
            check[i] = false;
            int dem = 0;
            for(int j = 1; j <= v; j++){
                if(check[j]){
                    DFS(j);
                    dem++;
                }
            }
            result.add(dem);
        }
        result.forEach(item -> System.out.println(item));
    }

    private static void DFS(int u) {
        check[u] = false;
        for(Integer x:edge[u]){
            if(check[x])DFS(x);
        }
    }

    private static void init(int v) {
        for(int i = 1; i <= v; i++){
            check[i] = true;
        }
    }
}
