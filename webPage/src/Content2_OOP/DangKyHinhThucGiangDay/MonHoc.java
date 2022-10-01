package Content2_OOP.DangKyHinhThucGiangDay;

public class MonHoc {
    private String maMon,tenMon,hinhThucDayLT,hinhThucDayTH;
    private int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi,String hinhThucDayLT, String hinhThucDayTH) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucDayLT = hinhThucDayLT;
        this.hinhThucDayTH = hinhThucDayTH;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getHinhThucDayTH() {
        return hinhThucDayTH;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTinChi + " " + hinhThucDayLT + " " + hinhThucDayTH;
    }
}
