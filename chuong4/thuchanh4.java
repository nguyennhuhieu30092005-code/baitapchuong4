import java.util.Scanner;

public class thuchanh4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so luong can nhap:");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        double tong = 0;

        for(int i = 0; i < n; i++){
            System.out.println("nhap so thu tu" + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            tong += numbers[i];
        }

        System.out.println("Ket qua");
        for(int i = 0; i < n; i++){
            System.out.print((i + 1) + " = " + numbers[i]);
            if (i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("Tong =" + tong);
        scanner.close();

    }
}
