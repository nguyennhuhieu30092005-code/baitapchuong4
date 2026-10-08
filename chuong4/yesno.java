import java.util.Scanner;

public class yesno {
    public static void main(String[] args) {
        System.out.println("Xin moi nhap yes or no:");
        Scanner consolo = new Scanner(System.in);

        String nhap = consolo.next();

        if(nhap == "yes"){
            System.out.println("Ban da nhap yes: ");
        }else if(nhap == "no"){
            System.out.println("Ban da nhap no: ");
        }else{
            System.out.println("Ban chua nhap yes or no:");
        }
    }
}
