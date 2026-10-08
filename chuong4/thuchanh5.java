import java.util.Scanner;

public class thuchanh5 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong can nhap: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        double tong = 0;
        int demAm = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();

            tong += numbers[i];

            if(numbers[i] < 0){
                demAm++;
            }
        }
        System.out.println("Ket qua");

        for(int i = 0; i < n; i++){
            System.out.print((i + 1) + " = " + numbers[i]);
            if(i < n -1){
                System.out.print(", ");
            }
        }
        System.out.println("Va tong=" + tong + ", negative = " + demAm);

        scanner.close();
    }
}
