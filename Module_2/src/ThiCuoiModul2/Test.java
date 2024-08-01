package ThiCuoiModul2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Manage manager = new Manage();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    manager.display();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void add() {
        try {
            System.out.print("Nhập mã bệnh án (BA-XXX): ");
            String code = scanner.nextLine();
            checkCode(code);

            System.out.print("Nhập mã bệnh nhân (BN-XXX): ");
            String patientCode = scanner.nextLine();
            checkPatientCode(patientCode);

            System.out.print("Nhập tên bệnh nhân: ");
            String name = scanner.nextLine();

            System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
            LocalDate dateIn = LocalDate.parse(scanner.nextLine(), Manage.DATE_FORMATTER);

            System.out.print("Nhập ngày ra viện (dd/MM/yyyy): ");
            LocalDate dateOut = LocalDate.parse(scanner.nextLine(), Manage.DATE_FORMATTER);
            if (dateIn.isAfter(dateOut)) {
                System.out.println("Ngày nhập viện không thể sau ngày ra viện.");
                return;
            }

            System.out.print("Nhập lý do nhập viện: ");
            String reason = scanner.nextLine();

            System.out.print("Nhập loại bệnh án (1: Thường, 2: VIP): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 1) {
                System.out.print("Nhập phí bệnh án: ");
                long fees = scanner.nextLong();
                scanner.nextLine();
                NormalPerson record = new NormalPerson(manager.getRecordCount() + 1, code, patientCode, name, dateIn, dateOut, reason, fees);
                manager.add(record);
            } else if (type == 2) {
                System.out.print("Nhập loại VIP (VIP I, VIP II, VIP III): ");
                String vipType = scanner.nextLine();
                if (!Pattern.matches("VIP I|VIP II|VIP III", vipType)) {
                    System.out.println("Loại VIP không hợp lệ.");
                    return;
                }
                VipPerson record = new VipPerson(manager.getRecordCount() + 1, code, patientCode, name, dateIn, dateOut, reason, vipType);
                manager.add(record);
            } else {
                System.out.println("Loại bệnh án không hợp lệ.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Định dạng ngày tháng không hợp lệ.");
        } catch (InputMismatchException e) {
            System.out.println("Dữ liệu nhập vào không hợp lệ.");
            scanner.nextLine();
        } catch (MedicalRecordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void delete() {
        System.out.print("Nhập mã bệnh án để xóa: ");
        String code = scanner.nextLine();
        if (manager.isRecordExists(code)) {
            System.out.print("Bạn có chắc chắn muốn xóa bệnh án này? (Yes/No): ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("Yes")) {
                manager.delete(code);
            }
        } else {
            System.out.println("Bệnh án không tồn tại.");
        }
    }

    private static void checkCode(String code) {
        if (!Pattern.matches("BA-\\d{3}", code)) {
            System.out.println("Mã bệnh án không hợp lệ.");
        }
    }

    private static void checkPatientCode(String patientCode) {
        if (!Pattern.matches("BN-\\d{3}", patientCode)) {
            System.out.println("Mã bệnh nhân không hợp lệ.");
        }
    }
}
