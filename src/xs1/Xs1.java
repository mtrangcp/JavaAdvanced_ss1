package xs1;

import gioi1.User;

public class Xs1 {
    public static void main(String[] args) {
        User u = new User();

        try {
            u.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Chương trình vẫn tiếp tục chạy.");

    }
}
