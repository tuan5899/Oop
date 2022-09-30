package TraCuuDonHang;


public class DonHang {
    private String tenHang, maDonHang;
    private long donGia,soLuong;

    public DonHang(String tenHang, String maDonHang, long donGia, long soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        String result = "";
        int giamGia = 0;
        if(Integer.parseInt(String.valueOf(tenHang.charAt(tenHang.length() - 1))) == 1) {
            giamGia = 30;
        }
        else{
            giamGia = 50;
        }
        result = tenHang + " " + maDonHang + " " + maDonHang.substring(1, 4) + " " +
                (donGia*soLuong*giamGia/100) + " " + (donGia*soLuong-(donGia*soLuong*giamGia/100));
        return result;
    }
}
