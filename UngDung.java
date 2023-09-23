package Buoi2;

import java.util.Scanner;

public class UngDung   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int [5];
        do {
            System.out.println("************Chọn 1 chức năng*************");
            System.out.println("1.Nhập giá trị của mảng");
            System.out.println("2.In Giá trị");
            System.out.println("3.In giá trị chẵn");
            System.out.println("4.In giá trị phần tử có chỉ số lẻ");
            System.out.println("5.Tỉnh tổng các phần tử");
            System.out.println("6.Sắp xếp mảng tăng dần");
            System.out.println("7.Thoát");
            int selected = scanner.nextInt();
            switch (selected){
                case 1:
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("Giá trị phần tử thứ %d:\n",i+1);
                        arrInt[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phẩn tử của mảng arrInt là:\n");
                    for (int element :
                            arrInt) {
                        System.out.printf("%d\t",element);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Giá trị các phẩn tử là chẵn của mảng arrInt là:\n");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i]%2==0){
                            System.out.printf("%d\t",arrInt[i]);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Phẩn tử có chỉ số lẻ của mảng arrInt là:\n");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (i % 2 != 0){
                            System.out.printf("%d\t",arrInt[i]);
                        }
                    };
                case 5:
                    int count = 0;
                    for (int i = 0; i < arrInt.length; i++) {
                        count += arrInt[i];
                    }
                    System.out.printf("Tổng các phẩn tử trong mảng là: %d\n",count);
                    break;
                case 6:
                    for (int i = 0; i < arrInt.length-1; i++) {
                        for (int j = i+1; j < arrInt.length; j++) {
                            if (arrInt[i]>arrInt[j]){
                                int temp =arrInt[i];
                                arrInt[i] = arrInt[j];
                                arrInt[j] = temp;
                            }
                        }
                    }
                    System.out.print("Các phần tử mảng sau khi sắp xếp là: \n");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("%d\t",arrInt[i]);
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
