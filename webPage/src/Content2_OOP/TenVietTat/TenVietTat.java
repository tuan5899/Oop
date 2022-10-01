package Content2_OOP.TenVietTat;

import java.util.StringTokenizer;

public class TenVietTat {
    private String ten;

    public String getTen() {
        StringTokenizer str = new StringTokenizer(ten, " ");
        String result = "";
        while(str.hasMoreTokens()){
            result = str.nextToken();
        }
        return result;
    }

    public String getHo() {
        StringTokenizer str = new StringTokenizer(ten, " ");
        return str.nextToken();
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public TenVietTat(String ten) {
        this.ten = ten;
    }

    public Boolean checkContains(String a){
        StringTokenizer str = new StringTokenizer(a,".");
        StringTokenizer str1 = new StringTokenizer(ten, " ");
        boolean check = false;
        if(str.countTokens() - str1.countTokens() != 0){
            return false;
        }
        else{
            while(str.hasMoreTokens()){
                String temp = str.nextToken();
                String temp1 = str1.nextToken();
                if(!temp.equals("*") && !temp1.substring(0,1).equals(temp)){
                    check = true;
                }
            }
        }
        return !check;
    }

    @Override
    public String toString() {
        return ten;
    }
}
