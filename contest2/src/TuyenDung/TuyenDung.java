package TuyenDung;

public class TuyenDung {
    private String ten,maSV, trangThai;
    private Float diem;
    private static int id = 1;

    public TuyenDung(String ten, float d1, float d2) {
        this.ten = ten;
        this.diem = tinhDiem(d1,d2);
        this.maSV = setMaSV();
    }

    public String setMaSV() {
        StringBuilder str = new StringBuilder(String.valueOf(id));
        if(id < 10){
            str.insert(0,"0");
        }
        id++;
        str.insert(0,"TS");
        return str.toString();
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    private Float tinhDiem(float d1, float d2) {
        if(d1 > 10){
            d1 = (int)d1/10 + (float)(d1%10)/10;
        }
        if(d2 > 10){
            d2 = (int)d2/10 + (float)(d2%10)/10;
        }
        return (float)(d1+d2)/2;
    }

    public Float getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + String.format("%.2f", diem) + " " + trangThai;
    }
}
