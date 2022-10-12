package ChiaCatDoThi;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[105];
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int v = in.nextInt(), e = in.nextInt();
            for(int i = 0; i <= v; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 1; i <= e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            PriorityQueue<Integer>q = new PriorityQueue<>();
            int maxLT = 0;
            for(int i = 1; i <= v; i++){
                init(v);
                int dem = 0;
                check[i] = false;
                for(int j = 1; j <= v; j++){
                    if(check[j]){
                        BFS(j);
                        dem++;
                    }
                }
                if(maxLT == dem && maxLT != 0){
                    q.add(i);
                }
                else if(maxLT < dem && dem != 1){
                    while(!q.isEmpty())q.poll();
                    maxLT = Math.max(maxLT,dem);
                    q.add(i);
                }
            }
            if(q.isEmpty()) System.out.println(0);
            else{
                while(!q.isEmpty()) System.out.println(q.poll());
            }
        }
    }

    private static void BFS(int u) {
        check[u] = false;
        Queue<Integer>q = new LinkedList<>();
        q.add(u);
        while(!q.isEmpty()){
            int v = q.poll();
            for(Integer x:edge[v]){
                if(check[x])q.add(x);
                check[x] = false;
            }
        }
    }

    private static void init(int v) {
        for(int i = 1; i <= v; i++){
            check[i] = true;
        }
    }
}
