import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a= scanner.nextInt();

        System.out.println("Введите значение процента(%): ");
        int b= scanner.nextInt();
        double c= (double)(a*b)/100;
        System.out.println(b+" процентов от "+a+" = "+c );

    }
}
