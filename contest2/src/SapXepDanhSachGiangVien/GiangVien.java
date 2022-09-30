package SapXepDanhSachGiangVien;

import java.util.StringTokenizer;

public class GiangVien {
    private String maGV,ten,khoa;
    private static int id = 1;

    public String getMaGV() {
        return maGV;
    }

    public String getTen() {
        StringTokenizer str = new StringTokenizer(ten, " ");
        String result = "";
        while(str.hasMoreTokens()){
            result = str.nextToken();
        }
        return result;
    }

    public GiangVien(String ten, String khoa) {
        this.ten = ten;
        this.khoa = xuLyKhoa(khoa);
        maGV = xuLyMaGV();
    }

    private String xuLyMaGV() {
        StringBuilder result = new StringBuilder(String.valueOf(id));
        if(id < 10){
            result.insert(0,"0");
        }
        id++;
        result.insert(0,"GV");
        return result.toString();
    }

    private String xuLyKhoa(String khoa) {
        StringTokenizer str = new StringTokenizer(khoa, " ");
        StringBuilder result = new StringBuilder("");
        while(str.hasMoreTokens()){
            result.append(str.nextToken().substring(0,1).toUpperCase());
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return maGV + " " + ten + " " + khoa;
    }
}
