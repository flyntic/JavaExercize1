import java.util.Random;

public class homework9 {
    static int LENGTH=10;
    public static void main(String[] args) {
        int[] arrInt=new int[LENGTH];
        Random rand=new Random();
        int countNull=0,countNegative=0,countPositive=0,minValue=Integer.MAX_VALUE,maxValue=Integer.MIN_VALUE;

        System.out.print("Случайный массив:");
        for (int i=0;i<LENGTH;i++)
        {
            arrInt[i]=rand.nextInt();//Integer.MIN_VALUE,Integer.MAX_VALUE
            if(i!=0) System.out.print(", ");
            System.out.print(arrInt[i]);

            if (arrInt[i]==0)countNull++;
            if (arrInt[i]>0) countPositive++;
            if (arrInt[i]<0) countNegative++;
            if (arrInt[i]>maxValue) maxValue=arrInt[i];
            if (arrInt[i]<minValue) minValue=arrInt[i];
        }
        System.out.println("");

        System.out.println("Количество нулей в массиве: "+ countNull);
        System.out.println("Количество положительных значений: "+ countPositive);
        System.out.println("Количество отрицательных значений: "+ countNegative);
        System.out.println("Максимальное значение: "+ maxValue);
        System.out.println("Миниммальное значение: "+ minValue);


    }
}
