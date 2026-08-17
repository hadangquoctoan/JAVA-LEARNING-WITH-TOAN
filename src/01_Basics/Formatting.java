package Source_Code_Mau;

public class Sample_3_Formatting {
    public static void main(String[] args) {
        int soNguyen = 25;
        double soThuc = 12.3456789;
        String chuoiText = "Java";

        // Định dạng dữ liệu với printf
        System.out.printf("Số nguyên: %d\n", soNguyen);
        System.out.printf("Số thực (mặc định): %f\n", soThuc);
        System.out.printf("Số thực (3 số lẻ): %.3f\n", soThuc);
        System.out.printf("Chuỗi ký tự: %s\n", chuoiText);

        System.out.println("-----------------------------------");
        System.out.printf("Học %s rất hay! Hôm nay là ngày %d, điểm số: %.3f\n", chuoiText, soNguyen, soThuc);
    }
}
