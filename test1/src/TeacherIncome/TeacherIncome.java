package TeacherIncome;

import java.util.StringTokenizer;

public class TeacherIncome {
    private String teacherCode, name;
    private long basicIncome;
    private static final long ht = 2000000, hp = 900000, gv = 500000;

    public TeacherIncome(String teacherCode, String name, long basicIncome) {
        this.teacherCode = teacherCode;
        this.name = name;
        this.basicIncome = basicIncome;
    }

    public String finalInCome(){
        String position = teacherCode.charAt(0) + "" + teacherCode.charAt(1) + "";
        String income = teacherCode.charAt(2) + "" + teacherCode.charAt(3) + "";

        long ones = 0;
        if(position.equals("HP")){
            ones = hp;
        }
        if(position.equals("HT")){
            ones = ht;
        }
        if(position.equals("GV")){
            ones = gv;
        }
        long totalInCome = basicIncome*Integer.parseInt(income) + ones;
        return teacherCode + " " + name + " " +
                Integer.parseInt(income) + " " + ones + " " + totalInCome;
    }
}
