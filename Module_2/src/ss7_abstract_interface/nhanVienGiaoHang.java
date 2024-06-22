package ss7_abstract_interface;

public class nhanVienGiaoHang extends Person{
    private String loaiXe;

    public nhanVienGiaoHang(String ma, String name, String phone, String chucVu, String loaiXe) {
        super(ma, name, phone, chucVu);
        this.loaiXe = loaiXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    @Override
    public String toString() {
        return "NhanVienGiaoHang {" +
                "ma=" + getMa() +
                ", name='" + getName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", chucVu='" + getChucVu() + '\'' +
                ", loaiXe='" + loaiXe + '\'' +
                '}';
    }
}
