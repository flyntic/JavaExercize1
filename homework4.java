import java.util.Scanner;

public class homework4 {
    public static void main(String[] args)  {
        Scanner scanner=  new Scanner(System.in);
        int result=0;
        String str;
        do {
            System.out.println("Введите 6-значное число:");
            str = scanner.nextLine();

            if (str.length() == 6) {
                for (int i = 0; i < 6; i++)
                    if (!((str.charAt(i) >= '0') && (str.charAt(i) <= '9'))) {
                        continue;
                    }
                break;
            }
            System.out.println("Неправильно введена число");
        }
        while (true);
        char[] c= str.toCharArray();
        c[0]=str.charAt(5);
        c[5]=str.charAt(0);
        c[1]=str.charAt(4);
        c[4]=str.charAt(1);

        result=Integer.parseInt(new String(c));
        System.out.println("Полученное число "+ result);

    }
}
