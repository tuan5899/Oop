package Content2_OOP.BaiToanTuyenSinh;

public class TuyenSinh {
    private String maSV,hoTen, trangThai;
    private float dToan,dLy,dHoa,dCong;

    public TuyenSinh(String maSV, String hoTen, Float dToan, Float dLy, Float dHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.dToan = dToan;
        this.dLy = dLy;
        this.dHoa = dHoa;
        dCong = tinhDCong(maSV);
        trangThai = setTrangThai(dToan,dLy,dHoa,dCong);
    }

    private String setTrangThai(Float dToan, Float dLy, Float dHoa, Float dCong) {
            if((dToan*2 + dLy + dHoa + dCong) >= 24){
                return "TRUNG TUYEN";
            }
            else return "TRUOT";
    }

    private float tinhDCong(String maSV) {
        String khuVuc = maSV.substring(0,3);
        Float result = 0f;
        switch (khuVuc){
            case "KV1":
                result = 0.5f;
                break;
            case "KV2":
                result = 1.0f;
                break;
            case "KV3":
                result = 2.5f;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        String dCongOutput = dCong % 1 == 0 ? String.valueOf((int)dCong):String.format("%.1f",dCong);
        String dTotal = (dToan*2 + dLy + dHoa)%1==0 ?
                String.valueOf((int)(dToan*2 + dLy + dHoa)):String.format("%.1f",(dToan*2 + dLy + dHoa));
        return maSV + " " + hoTen + " " + dCongOutput + " " + dTotal + " " + trangThai;
    }
}
