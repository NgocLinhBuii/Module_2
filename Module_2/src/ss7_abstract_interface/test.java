package ss7_abstract_interface;

public class test {
    public static void main(String[] args) {
        nhanVienVanPhong nv1 = new nhanVienVanPhong("1", "Nguyễn Văn A", "0123456789", "Nhân viên");
        nhanVienGiaoHang nv2 = new nhanVienGiaoHang("2", "Nguyễn Văn B", "0147852369", "Giao Hàng", "Xe máy");
        nhanVienCongXuong nv3 = new nhanVienCongXuong("3", "Nguyễn văn c", "01234567", "Công Xưởng", "abc", "nhân viên");

        System.out.println(nv1);
        System.out.println(nv2);
        System.out.println(nv3);
    }
}
