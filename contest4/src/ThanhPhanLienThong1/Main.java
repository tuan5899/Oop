package ThanhPhanLienThong1;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[505];
    static boolean check[] = new boolean[505];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt(), e = in.nextInt();
        int x = in.nextInt();
        for(int i = 0; i <= v; i++){
            check[i] = true;
            edge[i] = new ArrayList<>();
        }
        for(int i = 1; i <= e; i++){
            int a = in.nextInt(), b = in.nextInt();
            edge[a].add(b);
            edge[b].add(a);
        }
        BFS(x);
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = 1; i <= v; i++){
            if(i != x && check[i]){
                result.add(i);
            }
        }
        if(result.size() == 0) System.out.println(0);
        else{
            result.forEach(item -> System.out.println(item));
        }
    }

    private static void BFS(int u) {
        check[u] = false;
        Queue<Integer>q = new LinkedList<>();
        q.add(u);
        while(!q.isEmpty()){
            int v = q.poll();
            for(Integer x: edge[v]){
                if(check[x]){
                    check[x] = false;
                    q.add(x);
                }
            }
        }
    }
}
