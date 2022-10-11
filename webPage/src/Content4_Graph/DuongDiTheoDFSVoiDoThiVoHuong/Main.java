package Content4_Graph.DuongDiTheoDFSVoiDoThiVoHuong;

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
            int startP = in.nextInt(), endP = in.nextInt();
            for(int i = 0; i <= v; i++){
                edge[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 1; i <= e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            DFS(startP,endP);
            if(check[endP]) System.out.println(-1);
            else{
                StringBuilder str = new StringBuilder("");
                while(endP != startP){
                    str.insert(0, endP + " ");
                    endP = before[endP];
                }
                str.insert(0, endP + " ");
                System.out.println(str.toString().trim());
            }
        }
    }

    private static void DFS(int startP, int endP) {
        check[startP] = false;
        if(startP == endP) return;
        for(Integer x:edge[startP]){
            if(check[x]){
                before[x] = startP;
                DFS(x, endP);
            }
        }
    }
}
