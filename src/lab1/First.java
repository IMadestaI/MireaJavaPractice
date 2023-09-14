package lab1;

public class First {
    public static void main(String[] args) {
        int n = 10; // количество чисел
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100); // массив случайно заполняется
            sum += arr[i]; // считается общая сумма
        }
        System.out.printf(String.valueOf(sum / n));
    }
}
