package Content2_OOP.DanhSach_SapXepDanhSach_DoiTuongNhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String name, gender, address, taxcode, maNV;
    private static int id = 0;
    private Date dateOfBirth, signDate;

    public NhanVien(String name, String gender, String dateOfBirth, String address, String taxcode, String signDate) throws ParseException {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.address = address;
        this.taxcode = taxcode;
        this.signDate = new SimpleDateFormat("dd/MM/yyyy").parse(signDate);
        maNV = createID();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    private String createID() {
        id++;
        StringBuilder result = new StringBuilder(String.valueOf(id));
        int n = result.length();
        for(int i = 5; i > n; i--){
            result.insert(0,"0");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return maNV+ " " + name + " " + gender + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth) +
                " " + address + " " + taxcode + " " + new SimpleDateFormat("dd/MM/yyyy").format(signDate);
    }
}
