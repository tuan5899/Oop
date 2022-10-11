package Content4_Graph.DuongDiTheoBFS;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int before[] = new int[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int v = in.nextInt(), e = in.nextInt();
            int startP = in.nextInt();
            for(int i = 0; i <= v; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
                before[i] = 0;
            }
            for(int i = 0; i < e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            BFS(startP);
            for(int i = 1; i <= v; i++){
                if(i != startP && !check[i]){
                    int temp = i;
                    StringBuilder str = new StringBuilder("");
                    while(temp != startP){
                        str.insert(0,temp + " ");
                        temp = before[temp];
                    }
                    str.insert(0, temp + " ");
                    System.out.println(str.toString().trim());
                }
                else if(i != startP && check[i]){
                    System.out.println("No path");
                }
            }
        }
    }

    private static void BFS(int u) {
        Queue<Integer>q = new LinkedList<>();
        check[u] = false;
        q.add(u);
        while(!q.isEmpty()){
            int v = q.poll();
            for(Integer x:edge[v]){
                if(check[x]){
                    q.add(x);
                    before[x] = v;
                    check[x] = false;
                }
            }
        }
    }
}
