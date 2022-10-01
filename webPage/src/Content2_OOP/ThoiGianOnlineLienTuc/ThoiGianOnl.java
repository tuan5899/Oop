package Content2_OOP.ThoiGianOnlineLienTuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class ThoiGianOnl {
    private String ten;
    private Date ngayBatDau, ngayKetThuc;
    private Date gioBatDau,gioKetThuc;
    private int thoiGianOnl;

    public ThoiGianOnl(String ten, String ngayBatDau, String ngayKetThuc) throws ParseException {
        this.ten = ten;
        this.ngayBatDau = tinhNgayBatDau(ngayBatDau);
        this.gioBatDau = tinhGioBatDau(ngayBatDau);
        this.ngayKetThuc = tinhNgayKetThuc(ngayKetThuc);
        this.gioKetThuc = tinhGioKetThuc(ngayKetThuc);
        this.thoiGianOnl = tinhThoiGianOnl(this.ngayBatDau,this.ngayKetThuc,this.gioBatDau,this.gioKetThuc);
    }

    private int tinhThoiGianOnl(Date ngayBatDau, Date ngayKetThuc, Date gioBatDau, Date gioKetThuc) {
        long soNgay = new Date(ngayKetThuc.getTime()-ngayBatDau.getTime()).getTime();
        int soPhut = (int) ((new Date(gioKetThuc.getTime() + soNgay - gioBatDau.getTime()).getTime())/60000);
        return soPhut;
    }

    private Date tinhGioKetThuc(String ngayKetThuc) throws ParseException {
        String[] result = ngayKetThuc.split(" ");
        return new SimpleDateFormat("HH:mm:ss").parse(result[result.length-1]);
    }

    private Date tinhGioBatDau(String ngayBatDau) throws ParseException {
        String[] result = ngayBatDau.split(" ");
        return new SimpleDateFormat("HH:mm:ss").parse(result[result.length-1]);
    }

    private Date tinhNgayBatDau(String ngayBatDau) throws ParseException {
        String[] result = ngayBatDau.split(" ");
        return new SimpleDateFormat("dd/MM/yyyy").parse(result[0]);
    }

    private Date tinhNgayKetThuc(String ngayKetThuc) throws ParseException {
        String[] result = ngayKetThuc.split(" ");
        return new SimpleDateFormat("dd/MM/yyyy").parse(result[0]);
    }

    public int getThoiGianOnl() {
        return thoiGianOnl;
    }

    @Override
    public String toString() {
        return ten + " " + thoiGianOnl;
    }
}
