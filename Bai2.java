package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng row của mảng 2 chiều:");
        int row = scanner.nextInt();
        System.out.println("Nập số cột col của mảng:");
        int col = scanner.nextInt();
        int[][] arrInt = new int[row][col];
        do {
            System.out.println("*****MENU******");
            System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Nhập giá trị các phần tử arrInt[%d][%d]: \n", i, j);
                            arrInt[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử của mảng là:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%3d\t", arrInt[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum1 = 0;
                    System.out.println("Giá trị các phẩn tử nằm trên đường biên của mảng:");
                    for (int i = 0; i < row; i++) {
                        if (i == 0 || i == row - 1) {
                            for (int j = 0; j < col; j++) {
                                System.out.printf("%d\t", arrInt[i][j]);
                                sum1 += arrInt[i][j];
                            }
                        } else {
                            System.out.printf("%d\t%d\t", arrInt[i][0], arrInt[i][col - 1]);
                            sum1 = sum1 + arrInt[i][0] + arrInt[i][col - 1];
                        }
                    }
                    System.out.printf("\nTổng của chúng là: %d\n", sum1);
                    break;
                case 4:
                    int sum2 = 0;
                    if (row == col) {
                        System.out.println("Giá trị các pt trên đường chéo chính và phụ là:");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i == j) {
                                    System.out.printf("%d\t", arrInt[i][j]);
                                    sum2 += arrInt[i][j];
                                } else if (i + j == col - 1) {
                                    System.out.printf("%d\t", arrInt[i][j]);
                                    sum2 += arrInt[i][j];
                                }
                            }
                        }
                        System.out.printf("\nTổng của chúng là: %d\n",sum2);
                    }else {
                        System.out.println("Ma trận này không có đường chéo chính, phụ");
                    }
                    break;
                case 5:
                    int min = arrInt[0][0];
                    int max = arrInt[0][0];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (min>arrInt[i][j]){
                                min = arrInt[i][j];
                            }
                            if (arrInt[i][j]> max){
                                max = arrInt[i][j];
                            }
                        }
                    }
                    System.out.printf("Giá trị lớn nhất là: %d\t Nhỏ nhất là: %d\n",max, min);
                    break;
                case 6:
                    for (int k = 0; k < col; k++) {
                        int count = 0;
                        for (int i = 0; i <row - 1; i++) {
                            for (int j = i+1; j < row; j++) {
                                if (arrInt[i][k]>arrInt[j][k]){
                                    count = arrInt[i][k];
                                    arrInt[i][k] = arrInt[j][k];
                                    arrInt[j][k] = count;
                                }
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong, bấm 2 để xem mảng đã sắp xếp");
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
