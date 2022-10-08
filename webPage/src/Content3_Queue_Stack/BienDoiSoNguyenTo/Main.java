package Content3_Queue_Stack.BienDoiSoNguyenTo;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static Vector<Integer> lPrime = new Vector<>();
    static LinkedList<Integer> lGraph[] = new LinkedList[(int) 2e5 + 5];
    static boolean[] check = new boolean[(int) 2e5 + 5];
    static int[] count = new int[(int) 2e5 + 5];
    static int[] array = new int[(int) 2e5 + 5];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        initLPrime();
        initGraphNumber();
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            for (int i = 0; i < (int) 2e5 + 5; i++) {
                check[i] = false;
                count[i] = 0;
            }
            while (!q.isEmpty()) q.poll();
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(BFS(a, b));
        }
    }

    private static int BFS(int u, int dich) {
        q.add(u);
        count[u] = 0;
        while (!q.isEmpty()) {
            u = q.poll();
            check[u] = true;
            if (u == dich) break;
            for (int i = 0; i < lGraph[u].size(); i++) {
                int v = lGraph[u].get(i);
                if (check[v]) continue;
                check[v] = true;
                count[v]=count[u]+1;
                q.add(v);
            }
        }
        return count[dich];
    }

    private static void initGraphNumber() {
        for(int i = 0; i < lGraph.length; i++){
            lGraph[i] = new LinkedList<>();
        }
        for(int i = 0; i < lPrime.size(); i++){
            for(int j = i + 1; j < lPrime.size(); j++){
                if(checkDif(lPrime.get(i),lPrime.get(j))){
                    lGraph[lPrime.get(i)].add(lPrime.get(j));
                    lGraph[lPrime.get(j)].add(lPrime.get(i));
                }
            }
        }
    }

    private static boolean checkDif(Integer x, Integer y) {
        int dem = 0;
        while(x!=0){
            if(x%10 != y %10) dem++;
            x /= 10; y/=10;
        }
        return dem == 1;
    }

    private static void initLPrime() {
        for(int i = 2; i <= 10000; i++){
            if(array[i] == 0){
                for(int j = i * i; j <= 10000; j+= i){
                    array[j] = 1;
                }
            }
        }
        for(int i = 1000; i <= 9999; i++){
            if(array[i] == 0) lPrime.add(i);
        }
    }
}
