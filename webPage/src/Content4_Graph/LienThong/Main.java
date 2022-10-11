package Content4_Graph.LienThong;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[500];
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), x = in.nextInt();
        for(int i = 0; i <= n; i++){
            check[i] = true;
            edge[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            int a = in.nextInt(), b = in.nextInt();
            edge[a].add(b);
            edge[b].add(a);
        }
        BFS(x);
        boolean checkIfNone = true;
        for(int i = 1; i <= n; i++){
            if(check[i]) {
                System.out.println(i);
                checkIfNone = false;
            }
        }
        if(checkIfNone) System.out.println(0);
    }

    private static void BFS(int x) {
        check[x] = false;
        Queue<Integer>q = new LinkedList<>();
        q.add(x);
        while(!q.isEmpty()){
            int v = q.poll();
            for(Integer a:edge[v]){
                if(check[a]){
                    check[a] = false;
                    q.add(a);
                }
            }
        }
    }
}
