package LuyenTapLapTrinh;

import java.util.StringTokenizer;

public class LuyenTapLapTrinh {
    private String ten;
    private long baiLamDung,soLanSub;

    public LuyenTapLapTrinh(String ten, String inLine) {
        this.ten = ten;
        String[]str = inLine.trim().split(" ");
        this.baiLamDung = Long.parseLong(str[0]);
        this.soLanSub = Long.parseLong(str[1]);
    }

    public String getTen() {
        return ten;
    }

    public long getBaiLamDung() {
        return baiLamDung;
    }

    public long getSoLanSub() {
        return soLanSub;
    }

    @Override
    public String toString() {
        return ten + " " + baiLamDung + " " + soLanSub;
    }
}
