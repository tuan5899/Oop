package Content2_OOP.TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TinhGio {
    private String maNguoiChoi,ten;
    private Date gioVao,gioRa;
    private long tongGioChoi;

    public TinhGio(String maNguoiChoi, String ten, String gioVao, String gioRa) throws ParseException {
        this.maNguoiChoi = maNguoiChoi;
        this.ten = ten;
        this.gioVao = new SimpleDateFormat("hh:mm").parse(gioVao);
        this.gioRa = new SimpleDateFormat("hh:mm").parse(gioRa);
        tongGioChoi = tinhTongGioChoi(this.gioRa,this.gioVao);
    }

    private long tinhTongGioChoi(Date gioRa, Date gioVao) {
        long result = (gioRa.getTime()-gioVao.getTime())/60000;
        return result;
    }

    public long getTongGioChoi() {
        return tongGioChoi;
    }

    @Override
    public String toString() {
        return maNguoiChoi + " " + ten + " " + tongGioChoi/60 + " gio " + tongGioChoi%60 + " phut";
    }
}
