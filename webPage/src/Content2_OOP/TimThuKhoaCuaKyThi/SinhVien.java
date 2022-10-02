package Content2_OOP.TimThuKhoaCuaKyThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String Hoten;
    private int maSV;
    private static int id = 0;
    private Date ngaysinh;
    private float tongDiem, d1,d2,d3;

    public float getTongDiem() {
        return tongDiem;
    }

    public SinhVien(String hoten, String ngaysinh, float d1, float d2 , float d3)  throws ParseException{
        this.Hoten = chuanHoa(hoten);
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        maSV = createID();
        tongDiem = d1+d2+d3;
    }

    private String chuanHoa(String hoten) {
        StringTokenizer str = new StringTokenizer(hoten.trim().toLowerCase(), " ");
        StringBuilder result = new StringBuilder("");
        while(str.hasMoreTokens()){
            String temp = str.nextToken();
            result.append(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result.toString().trim();
    }

    private int createID() {
        id++;
        return id;
    }

    public int getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " +  Hoten +" " + ngaysinh + " " + tongDiem;
    }
}
