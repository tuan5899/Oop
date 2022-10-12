package DinhThat;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int v = in.nextInt(), e = in.nextInt();
            int startP = in.nextInt(), endP = in.nextInt();
            for(int i = 0; i <= v; i++){
                check[i] = true;
                edge[i] = new ArrayList<>();
            }
            for(int i = 1; i <= e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
            }
            ArrayList<Integer>res = new ArrayList<>();
            for(int i = 1; i <= v; i++){
                init(v);
                if(i != startP && i != endP)check[i] = false;
                BFS(startP,endP);
                if(check[endP]){
                    res.add(i);
                }
            }
            System.out.println(res.size());
        }
    }

    private static void BFS(int startP, int endP) {
        check[startP] = false;
        Queue<Integer>q = new LinkedList<>();
        q.add(startP);
        while(!q.isEmpty()){
            int v = q.poll();
            if(v == endP)break;
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
