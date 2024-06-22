package ss7_abstract_interface;

public class Person {
    protected String ma;
    protected String name;
    protected String phone;
    protected String chucVu;

    public Person(int ma, String name, String phone, String chucVu){

    }
    public Person(String ma, String name, String phone, String chucVu) {
        this.ma = ma;
        this.name = name;
        this.phone = phone;
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "chucVu='" + chucVu + '\'' +
                ", ma='" + ma + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
