package DanhSachMonThi;

public class DanhSachMonThi {
    private String maMon, tenMon, hinhThucThi;

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThucThi;
    }

    public DanhSachMonThi(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMon() {
        return maMon;
    }
}
