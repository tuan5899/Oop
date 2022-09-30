package TraCuuDonHang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
             DonHang dh = new DonHang(in.nextLine(),in.nextLine(),
                     Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            System.out.println(dh);
        }

    }
}
