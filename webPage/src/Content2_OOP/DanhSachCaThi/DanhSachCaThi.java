package DanhSachCaThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DanhSachCaThi {
    private String maCaThi, phongThi;
    private static int id = 0;
    private Date ngayThi, gioThi;

    public DanhSachCaThi(String ngayThi,String gioThi, String phongThi) throws ParseException {
        this.phongThi = phongThi;
        this.ngayThi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayThi);
        this.gioThi = new SimpleDateFormat("HH:mm").parse(gioThi);
        this.maCaThi = taoMaPhong();
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    private String taoMaPhong() {
        id++;
        StringBuilder result = new StringBuilder(String.valueOf(id));
        if(id < 10){
            result.insert(0,"00");
        }
        else if(id >= 10 && id < 100){
            result.insert(0,"0");
        }
        result.insert(0,"C");
        return result.toString();
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public Date getGioThi() {
        return gioThi;
    }

    @Override
    public String toString() {
        return maCaThi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayThi) + " "
                + new SimpleDateFormat("HH:mm").format(gioThi) + " " + phongThi;
    }
}
