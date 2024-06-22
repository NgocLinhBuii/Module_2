package ss7_abstract_interface;

public class nhanVienCongXuong extends Person {
    private String maXuong;
    private String type;

    public nhanVienCongXuong(String ma, String name, String phone, String chucVu, String maXuong, String type) {
        super(ma, name, phone, chucVu);
        this.maXuong = maXuong;
        this.type = type;
    }

    public String getMaXuong() {
        return maXuong;
    }

    public void setMaXuong(String maXuong) {
        this.maXuong = maXuong;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "nhanVienCongXuong{" +
                "maXuong='" + maXuong + '\'' +
                ", type='" + type + '\'' +
                ", chucVu='" + chucVu + '\'' +
                ", ma='" + ma + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
