import java.util.Scanner;

public class homework8 {
    public static void main(String[] args)  {
        Scanner scanner=  new Scanner(System.in);
        int begin;
        int end;

        System.out.println("Введите начало диапазона:");
        //хорошо бы проверку
        begin = scanner.nextInt();

        System.out.println("Введите конец диапазона");
        //хорошо бы проверку
        end = scanner.nextInt();

        if (begin>end) { begin+=end; end=begin-end; begin-=end;}

        for(int i=begin;i<=end;i++)
        {
            System.out.print("Таблица умножения на "+i+" : ");

            for(int j=1;j<=10;j++) {
                if (j != 1) System.out.print(", ");
                System.out.print( i+"*"+j+" = "+i*j);
            }
            System.out.println("");
        }

    }
}
