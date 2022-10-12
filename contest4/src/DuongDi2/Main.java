package DuongDi2;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[1005];
    static int before[] = new int[1005];
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int v = in.nextInt(), e = in.nextInt();
            int startP = in.nextInt();
            for(int i = 0; i <= v; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 1; i <= e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            BFS(startP);
            for(int i = 1; i <= v; i++){
                if(i != startP && !check[i]){
                    int temp = i;
                    StringBuilder result = new StringBuilder("");
                    while(temp != startP){
                        result.insert(0, temp + " ");
                        temp = before[temp];
                    }
                    result.insert(0, temp + " ");
                    System.out.println(result.toString().trim());
                }
                else if(i != startP && check[i])
                    System.out.println("No path");
            }
        }
    }

    private static void BFS(int startP) {
        check[startP] = false;
        Queue<Integer>q = new LinkedList<>();
        q.add(startP);
        while(!q.isEmpty()){
            int v = q.poll();
            for(Integer x:edge[v]){
                if(check[x]){
                    check[x] = false;
                    before[x] = v;
                    q.add(x);
                }
            }
        }
    }
}
