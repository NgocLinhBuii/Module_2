package ThiCuoiModul2;

import java.time.LocalDate;

public class VipPerson extends MedicalRecord {
    private String vipType;

    public VipPerson(int id, String code, String patientCode, String name, LocalDate dateIn, LocalDate dateOut, String reason, String vipType) {
        super(id, code, patientCode, name, dateIn, dateOut, reason);
        this.vipType = vipType;
    }

    public String getVipType() { return vipType; }
    public void setVipType(String vipType) { this.vipType = vipType; }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + vipType;
    }
}
