package Buoi2;

import java.util.Scanner;

public class UngDung2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrInt = new int[row][col];
        do {
            System.out.println("Hãy chọn 1 hành động:");
            System.out.println("1- Nhập giá trị các phần tử");
            System.out.println("2- In giá trị các phẩn tử");
            System.out.println("3- Tính tổng các phẩn tử");
            System.out.println("4- Tìm giá trị nhỏ nhất là lớn nhất trong mảng");
            System.out.println("5- Thoát");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Nhập phần tử arrInt[%d][%d]: ", i, j);
                            arrInt[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phẩn tử của mảng arrInt là:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%5d\t", arrInt[i][j]);
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            sum += arrInt[i][j];
                        }
                    }
                    System.out.printf("Tổng các phẩn tử của mảng là: %d\n", sum);
                    break;
                case 4:
                    int min = arrInt[0][0];
                    int max = arrInt[1][1];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arrInt[i][j]<min){
                                min = arrInt[i][j];
                            }
                        }
                    }
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (max<arrInt[i][j]){
                                max = arrInt[i][j];
                            }
                        }
                    }
                    System.out.printf("Giá trị nhỏ nhất của mảng là: %d\n",min);
                    System.out.printf("Giá trị lớn nhất của mảng là: %d\n", max);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
