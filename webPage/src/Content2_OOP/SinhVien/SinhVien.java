package SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String Hoten;
    private Date ngaysinh;
    private float d1,d2,d3;

    public SinhVien(String hoten,  String ngaysinh, float d1,float d2 ,float d3)  throws ParseException{
        this.Hoten = hoten;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return
                Hoten +" " +new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.1f",d1+d2+d3);
    }
}
