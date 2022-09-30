package DanhSachMatHang;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<MatHang>arrayList = new ArrayList<MatHang>();
        for(int i = 0; i < t; i++) {
            MatHang temp = new MatHang(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            arrayList.add(temp);
        }
        Collections.sort(arrayList, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (int) (o2.lai() - o1.lai());
            }
        });
        arrayList.forEach(item -> System.out.println(item.toString()));
    }
}
