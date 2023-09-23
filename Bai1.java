package Buoi2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng arrInt");
        int n = scanner.nextInt();
        int[] arrInt = new int[n];
        do {
            System.out.println("Hãy chọn chức năng sau:");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In các phần tử giá trị chẵn trong mảng và tính tổng");
            System.out.println("4. In các phần tử có giá trị là số nguyên tố và tính tổng");
            System.out.println("5. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng giảm dần");
            System.out.println("7. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao nhiêu phần tử có giá trị là m");
            System.out.println("Thoát");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Giá trị phần tử thứ %d là: ", i + 1);
                        arrInt[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị các phần tử của mảng:");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("%d\t", arrInt[i]);
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    int sum = 0;
                    System.out.println("Các phần tử của giá trị chẵn trong mảng là:");
                    for (int i = 0; i < n; i++) {
                        if (arrInt[i] % 2 == 0) {
                            System.out.printf("%d\t", arrInt[i]);
                            sum += arrInt[i];
                        }
                    }
                    System.out.printf("Tổng giá trị của chúng là: %d\n", sum);
                    break;
                case 4:
                    int sumN = 0;
                    System.out.println("Các số nguyên trong mảng là");
                    for (int i = 0; i < n; i++) {
                        boolean check = true;
                        if (arrInt[i] <= 1) {
                            check = false;
                        } else if (arrInt[i] <= 3) {
                            check = true;
                        } else if (arrInt[i] % 2 == 0 || arrInt[i] % 3 == 0) {
                            check = false;
                        } else {
                            int j =  5;
                            while (j * j <= n) {
                                if (n % j == 0 || n % (j + 2) == 0) {
                                    check = false;
                                    break;
                                }
                                j += 6;
                            }
                        }
                        if (check){
                            System.out.printf("%d\t", arrInt[i]);
                            sumN += arrInt[i];
                        }
                    }
                    System.out.printf("\nTổng các số nguyên tố là: %d\n", sumN);
                    break;
                case 5:
                    int min = arrInt[0];
                    int max = arrInt[0];
                    for (int i = 0; i < n; i++) {
                        if (arrInt[i]<min){
                            min = arrInt[i];
                        }
                        if (max<arrInt[i]){
                            max = arrInt[i];
                        }
                    }
                    System.out.printf("Giá trị nhỏ nhất là: %d, lớn nhất là: %d\n",min,max);
                    break;
                case 6:
                    int count = 0;
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i+1; j < n; j++) {
                            if (arrInt[i]<arrInt[j]){
                                count = arrInt[i];
                                arrInt[i] = arrInt[j];
                                arrInt[j] = count;
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
