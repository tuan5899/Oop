package TeacherIncome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TeacherIncome teacher = new TeacherIncome(in.nextLine(),in.nextLine(),in.nextLong());
        System.out.println(teacher.finalInCome());
    }
}
