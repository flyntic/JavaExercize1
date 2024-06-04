import java.util.Scanner;

public class homework6
{   public static void main(String[] args)  {
    Scanner scanner=  new Scanner(System.in);
    int metrs=0;
    char caseUser;
    String str;

    System.out.println("Введите значение длины в метрах:");
    //хорошо бы проверку
    str = scanner.nextLine();
    metrs=Integer.parseInt(str);


    System.out.println("В какие единицы перевести? 1 - мили, 2 - дюймы, 3 - ярды");
    //хорошо бы проверку
    str = scanner.nextLine();
    caseUser=str.charAt(0);

    switch (caseUser)
    {
        case '1':System.out.println(metrs + " метров ="+ (double)metrs/1609.34 +" миль");break;
        case '2':System.out.println(metrs + " метров ="+ (double)metrs/0.0254 +" дюймов");break;
        case '3':System.out.println(metrs + " метров ="+ (double)metrs/0.9144 +" ярдов");break;
        default: System.out.println("Неверный выбор");
    }

   }
}
