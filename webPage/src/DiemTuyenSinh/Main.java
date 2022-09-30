package DiemTuyenSinh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\Oop\\webPage\\src\\file rar and text\\ThiSinh.txt";
        Scanner in = new Scanner(new File("THISINH.in"));
        int test = Integer.parseInt(in.nextLine());
        ArrayList<DiemTuyenSinh>list = new ArrayList<>();
        while(test-->0){
            DiemTuyenSinh temp = new DiemTuyenSinh(in.nextLine(),Float.parseFloat(in.nextLine()),
                    in.nextLine(),Integer.parseInt(in.nextLine()));
            list.add(temp);
        }
        list.sort(new Comparator<DiemTuyenSinh>() {
            @Override
            public int compare(DiemTuyenSinh o1, DiemTuyenSinh o2) {
                return Float.compare(o2.getDiemThi(),o1.getDiemThi());
            }
        });
        list.forEach(item-> System.out.println(item));
    }
}