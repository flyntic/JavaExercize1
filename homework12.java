import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class homework12 {
    static  int LENGTH=10;
    public static void sort(Integer[] array,boolean ascOrder )
    {
        if (ascOrder==true ) Arrays.sort(array);
         else Arrays.sort(array,Collections.reverseOrder());

    }

    public static void main(String[] args) {
        Integer[] arrInt=new Integer[LENGTH];
        Random rand=new Random();
        Scanner scanner=  new Scanner(System.in);
        boolean ascOrder;

        for (int i=0;i<LENGTH;i++) {
            arrInt[i] = rand.nextInt();
        }

        System.out.println("Случайный массив: "+Arrays.toString(arrInt));
        System.out.println("Выберите сортировку (11- по возрастанию, 0- по убыванию)");
        //хорошо бы проверку
        ascOrder = scanner.nextInt()==1;

        sort(arrInt,ascOrder);
        System.out.println("Отсортированный массив: "+Arrays.toString(arrInt));

    }
}
