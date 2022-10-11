package Content4_Graph.ChuyenDanhSachCanhSangDanhSachKe;

import java.util.*;

public class Main {
    static ArrayList<Integer>edge[] = new ArrayList[1005];
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
            for(int i = 0; i < e; i++){
                int a = in.nextInt(), b = in.nextInt();
                edge[a].add(b);
                edge[b].add(a);
            }
            for(int i = 1; i <= v; i++){
                System.out.print(i + ": ");
                for(Integer x: edge[i]){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
