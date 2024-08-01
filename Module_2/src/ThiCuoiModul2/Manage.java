package ThiCuoiModul2;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Manage {
    private static final String FILE_CSV = "src/ThiCuoiModul2/data/medical_records.csv";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private List<MedicalRecord> list = new ArrayList<>();

    public Manage() {
        loadRecords();
    }

    public void add(MedicalRecord record) throws MedicalRecordException {
        for (MedicalRecord existingRecord : list) {
            if (existingRecord.getCode().equals(record.getCode())) {
                throw new MedicalRecordException("Bệnh án đã tồn tại.");
            }
        }
        list.add(record);
        save();
    }

    public void delete(String code) {
        boolean removed = list.removeIf(record -> record.getCode().equals(code));
        if (removed) {
            save();
        } else {
            System.out.println("Không tìm thấy mã bệnh án để xóa.");
        }
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("Danh sách bệnh án trống.");
        } else {
            for (MedicalRecord record : list) {
                System.out.println(record.toCSV());
            }
        }
    }

    private void loadRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_CSV))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 7) continue;

                try {
                    int id = Integer.parseInt(data[0]);
                    String code = data[1];
                    String patientCode = data[2];
                    String name = data[3];
                    LocalDate dateIn = LocalDate.parse(data[4], DATE_FORMATTER);
                    LocalDate dateOut = LocalDate.parse(data[5], DATE_FORMATTER);
                    String reason = data[6];

                    if (data.length == 8) {
                        long fees = Long.parseLong(data[7]);
                        list.add(new NormalPerson(id, code, patientCode, name, dateIn, dateOut, reason, fees));
                    } else if (data.length == 8) {
                        String vipType = data[7];
                        list.add(new VipPerson(id, code, patientCode, name, dateIn, dateOut, reason, vipType));
                    }
                } catch (NumberFormatException | DateTimeParseException e) {
                    System.out.println("Dữ liệu không hợp lệ trong dòng: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save() {
        File file = new File(FILE_CSV);
        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (MedicalRecord record : list) {
                writer.println(record.toCSV());
            }
            System.out.println("Dữ liệu đã được lưu vào " + FILE_CSV);
        } catch (IOException e) {
            System.err.println("Lỗi khi lưu dữ liệu vào file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public boolean isRecordExists(String code) {
        return list.stream().anyMatch(record -> record.getCode().equals(code));
    }

    public int getRecordCount() {
        return list.size();
    }
}
