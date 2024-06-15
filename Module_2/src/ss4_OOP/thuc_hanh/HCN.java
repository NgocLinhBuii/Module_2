package ss4_OOP.thuc_hanh;

public class HCN {
    double width, height;

    public HCN() {
    }

    public HCN(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public String display(){
        return "HCN { width: " + width + ", heigh: " + height + " }";
    }
}
