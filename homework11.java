import java.util.Scanner;

public class homework11 {
    public static void line(int length,boolean isHorizontal,char symbol)
    {
        while(length-->0)
        {
            System.out.print(symbol);
            if(!isHorizontal) System.out.println("");

        }

    }
    public static void main(String[] args)  {
        Scanner scanner=  new Scanner(System.in);
        int length;
        boolean isHorizontal;
        char symbol;

        System.out.println("Введите длину линии:");
        //хорошо бы проверку
        length = scanner.nextInt();

        System.out.println("Выберите направление (0- вертикально, 1- горизонтально)");
        //хорошо бы проверку
        isHorizontal = scanner.nextInt()==1;


        System.out.println("Введите символ");

        symbol = scanner.next().charAt(0);

        line(length,isHorizontal,symbol);
    }
}
