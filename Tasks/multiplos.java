import java.util.Scanner;

public class multiplos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;

        System.out.println("Digite o valor A: ");
        A = sc.nextInt();

        System.out.println("Digite o valor  B: ");
        B = sc.nextInt();

        if ( A % B == 0 || B % A == 0 ){
            System.out.println("É multiplo");
        }else{
            System.out.println("Näo e multiplo");
        }

sc.close();
    }
}
