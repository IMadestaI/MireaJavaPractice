package lab1;

public class Fith {
    // функция вычисления факториала
    public static void fact(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        fact(5);
    }
}
