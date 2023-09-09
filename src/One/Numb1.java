package One;

import java.util.Scanner;
public class Numb1 {
    public static void main(String[] args)
    {
        int sum = 0;
        int n = 0; //Length of array
        int av = 0; //Average num of array
        Scanner sc = new Scanner(System.in); //Need to use input/output system
        //Filling array
        System.out.println("Hello, please enter length of your array.");
        n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Type " +n+ " numbers");
        for (int i=0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        av = sum/n;
        System.out.println("Sum of array: " +sum+ "\nAverage: " +av);
    }
}
