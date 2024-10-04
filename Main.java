import Entity.Manager;
import Entity.Staff;
import Entity.Technician;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách Staff
        List<Staff> staffs = new ArrayList<>();

        // Thêm 3 đối tượng vào danh sách
        staffs.add(new Manager("Klopp", 5000, 1000));
        staffs.add(new Technician("Salah", 4000, 200));
        staffs.add(new Technician("Nunez", 3500, 300));

        // Nhập tên từ bàn phím và tìm nhân viên để trả lương
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter staff name to get paid: ");
        String name = scanner.nextLine();

        // Tìm nhân viên theo tên và trả lương
        Staff foundStaff = staffs.stream()
                .filter(staff -> staff.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);

        if (foundStaff != null) {
            System.out.println("Total salary for " + foundStaff.getName() + " is: " + foundStaff.getTotalSalary());
        } else {
            System.out.println("Staff not found!");
        }

        // Hiển thị thông tin của Manager hoặc Technician
        System.out.println("Displaying info of Managers or Technicians:");

        staffs.stream()
                .filter(staff -> staff instanceof Manager || staff instanceof Technician)
                .forEach(System.out::println); // Sử dụng phương thức toString để hiển thị thông tin
    }
}