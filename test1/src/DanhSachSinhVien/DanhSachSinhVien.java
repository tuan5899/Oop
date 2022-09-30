package DanhSachSinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DanhSachSinhVien {
    private String maSV,hoTen, lop;
    private static Integer id = 1;
    private Date ngaySinh;
    private float gpa;

    public DanhSachSinhVien(String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.maSV = createMaSV();
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    private String createMaSV() {
        StringBuilder result = new StringBuilder(id.toString());
        id++;
        for(int i = result.length(); i < 3; i++){
            result.insert(0, "0");
        }
        result.insert(0,"B20DCCN");
        return result.toString();
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f",gpa);
    }
}
