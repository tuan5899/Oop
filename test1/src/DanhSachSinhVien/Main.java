package DanhSachSinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        URL url = Main.class.getResource("SV.txt");
        Scanner in = new Scanner(new File("SV.in"));
        int t = in.nextInt();
        in.nextLine();
        while (in.hasNextLine()) {
            DanhSachSinhVien sv = new DanhSachSinhVien(in.nextLine(), in.nextLine()
                    , in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(sv);
        }
    }
}
