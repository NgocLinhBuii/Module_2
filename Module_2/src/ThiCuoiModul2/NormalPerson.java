package ThiCuoiModul2;

import java.time.LocalDate;

public class NormalPerson extends MedicalRecord {
    private long fees;

    public NormalPerson(int id, String code, String maBenhNhan, String name, LocalDate dateIn, LocalDate dateOut, String reason, long fees) {
        super(id, code, maBenhNhan, name, dateIn, dateOut, reason);
        this.fees = fees;
    }

    public long getFees() {
        return fees;
    }

    public void setFees(long fees) {
        this.fees = fees;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + fees;
    }
}
