package Content3_Queue_Stack.BienDoiS_T;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            System.out.println(biendoi(in.nextInt(), in.nextInt()));
        }
    }

    public static int biendoi(int s, int t) {
        if(s >= t) return s - t;
        Queue<Integer>q = new LinkedList<>();
        int[] array = new int[20001];
        q.offer(s);
        while(array[t] == 0){
            int top = q.poll();
            if(top - 1 > 0 && array[top - 1] == 0){
                array[top - 1] = array[top] + 1;
                q.add(top - 1);
            }
            if(top * 2 < 20000 && array[top*2] == 0){
                array[top*2] = array[top] + 1;
                q.add(top*2);
            }
        }
        return array[t];
    }
}
