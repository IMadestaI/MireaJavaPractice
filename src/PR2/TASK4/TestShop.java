package ru.mirea.PR2.TASK4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        System.out.println("Введите начальный ассортимент магазина: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<String> inputArr  = new ArrayList<String>();
        Collections.addAll(inputArr, input.split(" "));

        Shop shop = new Shop(inputArr);

        System.out.println(shop);
        System.out.println("Индекс компьютера в магазине: " + shop.findComputer("PC-1"));
        shop.addComputer("PC-15");
        System.out.println(shop);
        shop.deleteComputer("PC-1");
        System.out.println(shop);

    }
}
