package Content4_Graph.DuongDiCoHuong;

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
            int start = in.nextInt(), end = in.nextInt();
            for(int i = 0; i <= v; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 0; i < e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
            }
            BFS(start,end);
            if(check[end]){
                System.out.println(-1);
            }
            else{
                Queue<Integer>result = new LinkedList<>();
                while(end != start){
                    result.add(end);
                    end = before[end];
                }
                result.add(start);
                StringBuilder answer = new StringBuilder("");
                while (result.size() > 1){
                    answer.insert(0, " -> " + result.poll());
                }
                answer.insert(0, result.poll());
                System.out.println(answer.toString().trim());
            }
        }
    }

    private static void BFS(int start, int end) {
        check[start] = false;
        Queue<Integer>q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int v = q.poll();
            if(v == end) break;
            for(Integer x:edge[v]){
                if(check[x]) {
                    q.add(x);
                    before[x] = v;
                    check[x] = false;
                }
            }
        }
    }
}
