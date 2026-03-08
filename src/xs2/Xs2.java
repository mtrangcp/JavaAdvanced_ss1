package xs2;

import java.io.IOException;
import java.util.Scanner;

public class Xs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        try {
            System.out.print("Nhập tên người dùng: ");
            String name = sc.nextLine();

            if (name != null) {
                user.setName(name);
            }

            System.out.print("Nhập năm sinh: ");
            String yearStr = sc.nextLine();

            int year = Integer.parseInt(yearStr);
            int age = 2026 - year;

            user.setAge(age);

            System.out.print("Nhập số nhóm: ");
            int groups = sc.nextInt();

            int totalUsers = 10;
            int eachGroup = totalUsers / groups;

            System.out.println("Mỗi nhóm có: " + eachGroup + " người");

            FileService.saveToFile(user);

        } catch (NumberFormatException e) {
            Logger.logError("Năm sinh nhập không hợp lệ: " + e.getMessage());
        } catch (ArithmeticException e) {
            Logger.logError("Không thể chia cho 0");
        } catch (InvalidAgeException e) {
            Logger.logError(e.getMessage());
        } catch (IOException e) {
            Logger.logError("Lỗi ghi file: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }

        System.out.println("Chương trình kết thúc an toàn.");

    }
}