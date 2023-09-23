package PR3.TASK1;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class NewRandom {
    public static void Output(double[] arr)
    {
        System.out.println("Вывод массива: ");
        for (double i:arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Random rand = new Random();
        double[] arr = new double[10];
        for (int i = 0;i < 10;i++)
        {
            if (i < 5)
            {
                arr[i] = Math.random();
            }
            else
            {
                arr[i] = rand.nextDouble(100);
            }

        }
        Output(arr);
        Arrays.sort(arr);
        System.out.println("Отсортированный массив:");
        Output(arr);
    }
}

