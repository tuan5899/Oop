package DuaXeDap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class DuaXeDap {
    private String ten, donVi, maDV;
    private Date canDich;
    private String vanToc;

    public DuaXeDap(String ten, String donVi, String canDich) throws ParseException {
        this.ten = ten;
        this.donVi = donVi;
        this.canDich = new SimpleDateFormat("h:mm").parse(canDich);
        vanToc = xuLyVanToc();
        maDV = xuLyMaDV();
    }

    public String getVanToc() {
        return vanToc;
    }

    private String xuLyMaDV() {
        StringTokenizer str = new StringTokenizer(donVi.concat(" " + ten), " ");
        StringBuilder result = new StringBuilder("");
        while(str.hasMoreTokens()){
            result.append(str.nextToken().substring(0,1));
        }
        return result.toString().trim();
    }

    private String xuLyVanToc()
    {
        float h = 0;
        if(canDich.getHours() < 6){
            h = canDich.getHours() + (float)canDich.getMinutes()/60 + 6;

        }
        else{
            h = canDich.getHours() + (float)canDich.getMinutes()/60;
        }
        int result = (int)Math.round((double)120/(h - 6));
        return String.valueOf(result) + " Km/h";
    }

    @Override
    public String toString() {
        return maDV + " " + ten + " " + donVi + " " + vanToc;
    }
}
