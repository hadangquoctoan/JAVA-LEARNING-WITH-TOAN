import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        
        // 1. In ra câu chào mừng
        System.out.println("=== CHUONG TRINH TINH CHI SO BMI ===");
        
        // 2. Yêu cầu nhập chiều cao (m) và lưu vào biến
        double h = scanner.nextDouble();
        
        
        // 3. Yêu cầu nhập cân nặng (kg) và lưu vào biến
        double m = scanner.nextDouble();
        
        
        // 4. Tính chỉ số BMI (Cân nặng / (Chiều cao * Chiều cao))
        double BMI = m/ (h*h);

        
        
        // 5. In ra kết quả BMI được làm tròn 2 chữ số thập phân
        System.out.printf("BMI: %.2f\n", BMI);
        
        
        // 6. (Thử thách) Kiểm tra xem BMI có bình thường không (18.5 đến 24.9) và in ra true/false
        System.out.println(BMI >= 18.5 && BMI <= 24.9);
        
        
        // Đóng scanner sau khi dùng xong
        scanner.close();
    }
}
