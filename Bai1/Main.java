import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle vh1 = new Vehicle();
        Vehicle vh2 = new Vehicle();
        Vehicle vh3 = new Vehicle();
        int so = 3;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Nhap thong tin xe.");
        System.out.println("2. Xuat thong tin xe.");
        System.out.println("3. Thoat.");
        System.out.print("Chon chuc nang: ");

        so = scanner.nextInt();
        switch (so) {
            case 1:
                vh1.nhap();
                vh2.nhap();
                vh3.nhap();
                break;
            case 2:
                System.out.printf("%20s %20s %20s %20s %20s\n", "Ten Chu Xe", "Loai Xe", "Dung Tich", "Tri Gia", "Thue Phai Nop");
                System.out.println("===========================================================================================");
                vh1.xuat();
                vh2.xuat();
                vh3.xuat();
                break;
            default :
                break;
        }
        } while (so!=3);
    }
}