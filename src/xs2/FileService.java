package xs2;

import java.io.IOException;

public class FileService {
    public static void saveToFile(User user) throws IOException {
        if (user == null) {
            throw new IOException("Không thể ghi file: user null");
        }

        System.out.println("Đã lưu thông tin user vào file.");
    }
}
