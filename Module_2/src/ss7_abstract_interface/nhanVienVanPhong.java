package ss7_abstract_interface;

public class nhanVienVanPhong extends Person{

    public nhanVienVanPhong(String ma, String name, String phone, String chucVu) {
        super(ma, name, phone, chucVu);
    }

    @Override
    public String toString() {
        return "nhanVienVanPhong{" +
                "chucVu='" + chucVu + '\'' +
                ", ma='" + ma + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
