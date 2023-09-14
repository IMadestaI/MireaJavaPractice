package lab1;
import java.util.Scanner; // пакет используемый для ввода из командной строки

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt(); // ввод инфеормации
        int[] arr = new int[n];
        System.out.println("Enter numbers:");
        for (int i=0; i < n; i++) {
            arr[i] = in.nextInt(); // заполнение массива
        }
        // выполнение с помощью while
        int sum = 0;
        int maxi = arr[0];
        int mini = arr[0];
        int c = 0;
        while (c < n) {
            sum += arr[c];
            if (arr[c] > maxi) {
                maxi = arr[c];
            }
            if (arr[c] < mini) {
                mini = arr[c];
            }
            c++;
        }
        System.out.println("while:");
        System.out.println("sum = " + sum);

        System.out.println("max = " + maxi);
        System.out.println("min = " + mini);
        // выполнение с помощью do while
        maxi = arr[0];
        mini = arr[0];
        c = 0;
        sum = 0;
        do {
            sum += arr[c];
            if (arr[c] > maxi) {
                maxi = arr[c];
            }
            if (arr[c] < mini) {
                mini = arr[c];
            }
            c++;
        } while (c < n);
        System.out.println("do while:");
        System.out.println("sum = " + sum);
        System.out.println("max = " + maxi);
        System.out.println("min = " + mini);

    }

}