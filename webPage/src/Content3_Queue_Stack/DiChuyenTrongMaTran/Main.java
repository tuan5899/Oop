package Content3_Queue_Stack.DiChuyenTrongMaTran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int m = in.nextInt(), n = in.nextInt();
            int[][] input = new int[m + 1][n + 1];
            int[][] value = new int[m + 1][n + 1];
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n; j++){
                    input[i][j] = in.nextInt();
                }
            }
            if(1 == m && 1 == n) System.out.println(0);
            else{
                boolean check = false;
                Queue<data>q = new LinkedList<>();
                Set<data>set = new HashSet<>();
                set.add(new data(1,1));
                q.add(new data(1,1));
                while(!q.isEmpty()){
                    data temp = q.poll();
                    int x = temp.i + input[temp.i][temp.j];
                    int y = temp.j + input[temp.i][temp.j];
                    if(x <= m && !set.contains(new data(x,temp.j))){
                        q.add(new data(x,temp.j));
                        set.add(new data(x,temp.j));
                        value[x][temp.j] = value[x][temp.j] != 0 ?
                                (Math.min(value[x][temp.j],value[temp.i][temp.j] + 1)):(value[temp.i][temp.j] + 1);
                        if(x == m && temp.j == n){
                            check = true;
                            break;
                        }
                    }
                    if(y <= n && !set.contains(new data(temp.i,y))){
                        q.add(new data(temp.i,y));
                        set.add(new data(temp.i,y));
                        value[temp.i][y] = value[temp.i][y] != 0 ?
                                (Math.min(value[temp.i][y],value[temp.i][temp.j] + 1)):(value[temp.i][temp.j] + 1);
                        if(temp.i == m && y == n){
                            check = true;
                            break;
                        }
                    }
                }
                if(check) System.out.println(value[m][n]);
                else System.out.println(-1);
            }
        }
    }
    public static class data{
        int i, j;
        public data(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
