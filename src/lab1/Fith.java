package lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class Fith {
    // функция вычисления факториала
    public static void fact(int num) {
        BigInteger res = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        fact(5);
    }
}
