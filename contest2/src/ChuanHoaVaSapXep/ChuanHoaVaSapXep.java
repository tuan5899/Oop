package ChuanHoaVaSapXep;

import java.util.StringTokenizer;

public class ChuanHoaVaSapXep {
    private String name;

    public ChuanHoaVaSapXep(String name) {
        this.name = chuanHoaTen(name);
    }

    private String chuanHoaTen(String name) {
        StringTokenizer str = new StringTokenizer(name.trim().toLowerCase());
        StringBuilder result = new StringBuilder("");
        while(str.hasMoreTokens()){
            String temp = str.nextToken();
            result.append(temp.substring(0,1).toUpperCase() + temp.substring(1) + " ");
        }
        return result.toString().trim();
    }

    public String getLastName() {
        StringTokenizer str = new StringTokenizer(name, " ");
        String FirstName = null;
        while(str.hasMoreTokens()){
            FirstName = str.nextToken();
        }
        return FirstName;
    }

    public String getFirstName() {
        StringTokenizer str = new StringTokenizer(name, " ");
        String FirstName = str.nextToken();
        return FirstName;
    }

    public String getMiddleName() {
        StringTokenizer str = new StringTokenizer(name, " ");
        str.nextToken();
        return str.nextToken();
    }

    @Override
    public String toString() {
        return name;
    }
}
