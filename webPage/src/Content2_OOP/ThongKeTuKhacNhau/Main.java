package Content2_OOP.ThongKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WordSet ws = new WordSet(input);
        System.out.println(ws);
    }
}




