package ThiCuoiModul2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class MedicalRecord {
    private int id;
    private String code;
    private String patientCode;
    private String name;
    private LocalDate dateIn;
    private LocalDate dateOut;
    private String reason;

    public MedicalRecord(int id, String code, String patientCode, String name, LocalDate dateIn, LocalDate dateOut, String reason) {
        this.id = id;
        this.code = code;
        this.patientCode = patientCode;
        this.name = name;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.reason = reason;
    }

    public int getId() { return id; }
    public String getCode() { return code; }
    public String getPatientCode() { return patientCode; }
    public String getName() { return name; }
    public LocalDate getDateIn() { return dateIn; }
    public LocalDate getDateOut() { return dateOut; }
    public String getReason() { return reason; }

    public void setId(int id) { this.id = id; }
    public void setCode(String code) { this.code = code; }
    public void setPatientCode(String patientCode) { this.patientCode = patientCode; }
    public void setName(String name) { this.name = name; }
    public void setDateIn(LocalDate dateIn) { this.dateIn = dateIn; }
    public void setDateOut(LocalDate dateOut) { this.dateOut = dateOut; }
    public void setReason(String reason) { this.reason = reason; }

    public String toCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + "," + code + "," + patientCode + "," + name + "," +
                dateIn.format(formatter) + "," + dateOut.format(formatter) + "," + reason;
    }
}
