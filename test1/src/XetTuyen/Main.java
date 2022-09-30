package XetTuyen;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test1\\src\\XetTuyen.txt";
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            XetTuyenNhanVien nv = new XetTuyenNhanVien(in.nextLine(),in.nextLine(),
                    Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            System.out.println(nv);
        }
    }
}
