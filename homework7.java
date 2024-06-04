import java.util.Scanner;

public class homework7 {
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

        if ((begin==end)&&(begin%2==0))
        {
            System.out.println("Точки начала и конца диапазона соовпадают. Нечетных чисел в диапазоне нет");
            return;
        }
        if (begin>end) { begin+=end; end=begin-end; begin-=end;}

        if (begin%2==0) begin++;
        System.out.println("Нечетные числа в заданном диапазоне:");
        for(int i=begin;i<=end;i+=2)
        {
            if (i!=begin) System.out.print(", ");
            System.out.print(i);
        }

    }
}
