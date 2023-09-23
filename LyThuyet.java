package Buoi2;

public class LyThuyet{
    public static void main(String[] args) {
//        1 Khai báo mảng
        int[] arrInt = new int[5];
        float[] arrFloat = new float[3];
        String[] arrString = {"Nguyễn Văn A", "Nguyễn Văn B"};
//        Khỏi tạo giá trị:
        arrInt[0] = 1;
        arrFloat[0] = 1;
        arrString[0] = "Lê Văn Toàn";
//        In ra phẩn tử của mảng
        for (float element: arrFloat ) {
            System.out.printf("%f:\t",element);
        }
//        Mảng 2 chiều
    }
}
