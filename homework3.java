import java.util.Scanner;

public class homework3 {
    public static void main(String[] args)  {
        Scanner scanner=  new Scanner(System.in);
        int result=0;


        String str;
        for(int i=0;i<3;) {
            System.out.println("Введите цифру:");
            str = scanner.next();

            if (str.length()==1)

            if ((str.charAt(0) >= '0')&&(str.charAt(0) <= '9'))
            {
                result*=10;
                result+=str.charAt(0)-'0';
                i++;
                continue;
            }

            System.out.println("Неправильно введена цифра");
        }

        System.out.println("Полученное число "+ result);

    }
}
