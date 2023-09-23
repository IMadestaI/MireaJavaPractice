package PR3.TASK1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Task4
{
    public static void Output(int[] arr)
    {
        System.out.println("Вывод массива: ");
        for (int i:arr)
            System.out.print(i + "|");
        System.out.println();
    }
    public static void Output(ArrayList<Integer> arr)
    {
        System.out.println("Вывод массива: ");
        for (int i:arr)
            System.out.print(i + "|");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int n = 0, count = 0;
        boolean flag = true;
        while (flag)
        {
            System.out.print("Введите размер массива: ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n > 0)
            {
                flag = false;
            }
            else
            {
                System.out.println("Некоректный ввод, повторите попытку -_-");
            }
        }
        int[] numbers = new int[n];

        Random rand = new Random();
        for (int i = 0; i < numbers.length;i++)
            numbers[i] =  rand.nextInt(0,n);

        Output(numbers); // Вывод массива

        ArrayList<Integer> even_numbers = new ArrayList<>();

        for (int i:numbers)
            if (i % 2 == 0)
                even_numbers.add(i);

        Output(even_numbers);

    }
}
