package XetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class XetTuyenNhanVien {
    private String ten, maNV;
    private static int id = 1;
    private Date ngaySinh;
    private int total;
    private String xepLoai;

    public XetTuyenNhanVien(String ten, String ngaySinh, float d1, float d2) throws ParseException {
        this.maNV = createMaNV();
        this.ten = chuanHoaTen(ten);
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.total = tinhDiem(d1, d2);
    }

    private String createMaNV() {
        StringBuilder str = new StringBuilder(String.valueOf(id));
        if(id < 10){
            str.insert(0,"0");
        }
        str.insert(0,"PH");
        id++;
        return str.toString();
    }

    private int tinhDiem(float d1, float d2) {
        float diemthuong = 0;
        if(d1 >= 8 && d2 >= 8){
            diemthuong = 1;
        }
        if(8 > d1 && d1 >= 7.5 && 8 > d2 && d2 >= 7.5){
            diemthuong = 0.5f;
        }
        int result = Math.round((d1+d2)/2 + diemthuong);
        if(result > 10) result = 10;
        switch (result){
            case 4:
            case 3:
            case 2:
            case 1:
                xepLoai = "Truot";
                break;
            case 5:
            case 6:
                xepLoai = "Trung binh";
                break;
            case 7:
                xepLoai = "Kha";
                break;
            case 8:
                xepLoai = "Gioi";
                break;
            case 9:
            case 10:
                xepLoai = "Xuat sac";
                break;
        }
        return result;
    }

    private String chuanHoaTen(String ten) {
        StringTokenizer array = new StringTokenizer(ten.trim().toLowerCase(), " ");
        String result = "";
        while(array.hasMoreTokens()){
            String temp = array.nextToken();
            result = result.concat(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result;
    }

    @Override
    public String toString() {
        Date temp = new Date();
        return maNV + " " + ten + " " + (temp.getYear() - ngaySinh.getYear() - 1)
                + " " + total + " " + xepLoai;
    }
}
