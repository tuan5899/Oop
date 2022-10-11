package LopHinhChuNhat;

public class Rectange {
    private double width, heith;
    private String color;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeith() {
        return heith;
    }

    public void setHeith(double heith) {
        this.heith = heith;
    }

    public String getColor() {
        StringBuilder str = new StringBuilder("");
        String temp = color.toLowerCase().trim();
        str.append(temp.substring(0,1).toUpperCase() + temp.substring(1));
        return str.toString().trim();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectange(double width, double heith, String color) {
        this.width = width;
        this.heith = heith;
        this.color = color;
    }

    public Rectange() {
        this.width = 1;
        this.heith = 1;
    }
    public double findArea(){
        return width*heith;
    }
    public double findPerimeter(){
        return (width+heith)*2;
    }

}
