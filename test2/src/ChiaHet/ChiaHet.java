package ChiaHet;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) throws FileNotFoundException {
//        String path = "C:\\Users\\tuanq\\IdeaProjects\\test2\\src\\songuyen.txt";
        Scanner in = new Scanner(new File("SONGUYEN.IN"));
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            BigInteger b1 = new BigInteger(in.nextLine());
            BigInteger a = b1.divide(BigInteger.valueOf(13));
            BigInteger b = b1.divide(BigInteger.valueOf(7));
            BigInteger remain13 = b1.subtract(a.multiply(BigInteger.valueOf(13)));
            BigInteger remain7 = b1.subtract(b.multiply(BigInteger.valueOf(7)));
            if(remain13.equals(BigInteger.ZERO) && remain7.equals(BigInteger.ZERO)){
                System.out.println("Both");
            }
            else if(remain13.equals(BigInteger.ZERO)){
                System.out.println("Div 13");
            }
            else if(remain7.equals(BigInteger.ZERO)){
                System.out.println("Div 7");
            }
            else System.out.println("None");
        }
    }
}
