import java.util.ArrayList;
import java.util.Random;

public class homework10 {
    static int LENGTH=10;
    public static void main(String[] args) {
        int[] arrInt=new int[LENGTH];
        ArrayList<Integer> arrEven=new ArrayList<Integer>();
        ArrayList<Integer> arrOdd=new ArrayList<Integer>();
        ArrayList<Integer> arrPositive=new ArrayList<Integer>();
        ArrayList<Integer> arrNegative=new ArrayList<Integer>();

        Random rand=new Random();

        //int countNegative=0,countPositive=0,
        //    countOdd=0,countEven=0;

        System.out.print("Случайный массив:");
        for (int i=0;i<LENGTH;i++)
        {
            arrInt[i]=rand.nextInt();//Integer.MIN_VALUE,Integer.MAX_VALUE

            if(i!=0) System.out.print(", ");
            System.out.print(arrInt[i]);

            if (arrInt[i]>0) arrPositive.add(arrInt[i]);
            if (arrInt[i]<0) arrNegative.add(arrInt[i]);
            if (arrInt[i]%2==0) arrEven.add(arrInt[i]);
               else arrOdd.add(arrInt[i]);
        }
        System.out.println("");

        System.out.println("Все положительные значения: "+ arrPositive.toString());
        System.out.println("Все отрицательные значения: "+ arrNegative.toString());
        System.out.println("Все четные значения: "+ arrEven.toString());
        System.out.println("Все нечетные значения: "+ arrOdd.toString());


    }
}
