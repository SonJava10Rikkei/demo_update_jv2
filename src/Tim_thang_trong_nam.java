import java.util.Scanner;

public class Tim_thang_trong_nam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 2:
                System.out.println("Thang" + month + " co 31 ngay");
            case 4:
                System.out.println("Thang" + month + " co 28/29 ngay");
            case 3:
                System.out.println("Thang" + month + " co 30 ngay");

        }
    }
}
