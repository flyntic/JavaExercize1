import java.util.Scanner;

public class homework5 {
    public static void main(String[] args)  {
        Scanner scanner=  new Scanner(System.in);
        int mounth=0;
        String str;
        do {
            System.out.println("Введите номер месяца от 1 до 12:");
            str = scanner.nextLine();
            mounth=Integer.parseInt(str);

            if ((mounth>0)&&(mounth<=12))
            break;

            System.out.println("Неправильно введен месяц");
        }
        while (true);
        switch (mounth)
        {
            case 1:
            case 2:
            case 12:System.out.println("Зима");break;

            case 3:
            case 4:
            case 5:System.out.println("Весна");break;

            case 6:
            case 7:
            case 8:System.out.println("Лето");break;

            case 9:
            case 10:
            case 11:System.out.println("Осень");break;
        }



    }
}
