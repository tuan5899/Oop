package DanhSachTrungTuyen;

import java.util.StringTokenizer;

public class ThiSinh {
    private String maThiSinh,hoTen;
    private float dToan,dLy,dHoa;
    private String trangThai;

    public String getMaThiSinh() {
        return maThiSinh;
    }

    private String dTong,dUuTien;
    public String getdTong() {
        return dTong;
    }
    public ThiSinh(String maThiSinh, String hoTen, float dToan, float dLy, float dHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = chuanHoaTen(hoTen);
        this.dToan = dToan;
        this.dLy = dLy;
        this.dHoa = dHoa;
        dTong = tongDiem();
    }

    private String chuanHoaTen(String hoTen) {
        String str = hoTen.trim().toLowerCase();
        StringTokenizer array = new StringTokenizer(str, " ");
        String result = "";
        while(array.hasMoreTokens()){
            String temp = array.nextToken();
            result = result.concat(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    @Override
    public String toString() {
        return maThiSinh + " " + hoTen + " " + dUuTien + " " + dTong + " " + trangThai;
    }

    private String tongDiem(){
        String str = maThiSinh.substring(0,3);
        float dUuTien = 0.0F;
        if(str.equals("KV1")){
            dUuTien = 0.5F;
        }
        if(str.equals("KV2")){
            dUuTien = 1.0F;
        }
        if(str.equals("KV3")){
            dUuTien = 2.5F;
        }
        if(dUuTien % 1 == 0){
            this.dUuTien = String.valueOf((int)dUuTien);
        }
        else{
            this.dUuTien = String.format("%.1f",dUuTien);
        }
        float total = dToan*2 + dHoa + dLy + dUuTien;
        if(total % 1 == 0){
            return String.valueOf((int)total);
        }
        else{
            return String.format("%.1f",total);
        }
    }
}
