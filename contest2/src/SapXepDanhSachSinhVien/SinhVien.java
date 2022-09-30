package SapXepDanhSachSinhVien;

import java.util.StringTokenizer;

public class SinhVien {
    private String maSV,ten,soDT,email;

    public SinhVien(String maSV, String ten, String soDT, String email) {
        this.maSV = maSV;
        this.ten = ten;
        this.soDT = soDT;
        this.email = email;
    }

    public String getTen() {
        String result = "";
        StringTokenizer str = new StringTokenizer(ten," ");
        while(str.hasMoreTokens()){
            result = str.nextToken();
        }
        return result;
    }

    public String getHo(){
        StringTokenizer str = new StringTokenizer(ten," ");
        String result = str.nextToken();
        return result;
    }

    public String getDem(){
        StringTokenizer str = new StringTokenizer(ten," ");
        str.nextToken();
        String result = str.nextToken();
        return result;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + soDT + " " + email;
    }
}
