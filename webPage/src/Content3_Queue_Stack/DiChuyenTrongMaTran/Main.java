package Content3_Queue_Stack.DiChuyenTrongMaTran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            int m = in.nextInt();
            int n = in.nextInt();
            Queue<HandleObject> result = new LinkedList<>();
            int[][] array = new int[m + 1][n + 1];
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n; j++){
                    array[i][j] = in.nextInt();
                }
            }
            int dem = 0;
            int answer = 1000000;
            result.add(new HandleObject(1, 1, dem, array[1][1]));
            boolean check = false;
            while(!result.isEmpty()){
                HandleObject temp = result.poll();
                if(temp.m == m && temp.n == n){
                    check = true;
                    answer = Math.min(answer,temp.dem);
                }
                else{
                    if(temp.n + temp.a <= n) {
                        result.add(new HandleObject(temp.m, temp.n + temp.a,
                                temp.dem + 1, array[temp.m][temp.n + temp.a]));
                    }
                    if(temp.m + temp.a <= m) {
                        result.add(new HandleObject(temp.m + temp.a, temp.n,
                                temp.dem + 1, array[temp.m + temp.a][temp.n]));
                    }
                }
            }
            if(!check){
                System.out.println(-1);
            }
            else System.out.println(answer);
        }
    }
    public static class HandleObject {
        private int m, n, dem, a;

        public HandleObject(int m, int n, int dem, int a) {
            this.m = m;
            this.n = n;
            this.dem = dem;
            this.a = a;
        }
    }
}
