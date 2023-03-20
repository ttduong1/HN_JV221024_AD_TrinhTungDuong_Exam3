package JAVA_HACKATHON_05_ADVANCE_1_MENU;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JAVA_HACKATHON_05_ADVANCE_1_MENU {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim");
            System.out.println("2. Khách tiếp theo");
            System.out.println("3. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    scanner.nextLine(); // consume the newline character
                    String customerName = scanner.nextLine();
                    customerQueue.add(customerName);
                    System.out.println("Thêm " + customerName + " vào hàng đợi thành công.");
                    break;
                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("Hàng đợi rỗng.");
                    } else {
                        String nextCustomer = customerQueue.remove();
                        System.out.println("Khách hàng tiếp theo là: " + nextCustomer);
                    }
                    break;
                case 3:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}
