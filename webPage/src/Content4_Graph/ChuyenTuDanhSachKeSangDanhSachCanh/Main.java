package Content4_Graph.ChuyenTuDanhSachKeSangDanhSachCanh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = Integer.parseInt(in.nextLine());
        ArrayList<Integer>edge[] = new ArrayList[v + 1];
        for(int i = 1; i <= v; i++)edge[i] = new ArrayList<>();
        for(int i = 1; i <= v; i++){
            String s = in.nextLine();
            StringTokenizer str = new StringTokenizer(s, " ");
            while(str.hasMoreTokens()){
                String temp = str.nextToken();
                if(Integer.parseInt(temp) > i){
                    edge[i].add(Integer.parseInt(temp));
                }
            }
        }
        for(int i = 1; i <= v; i++){
            for(Integer x:edge[i]){
                System.out.println(i + " " + x);
            }
        }
    }
}
