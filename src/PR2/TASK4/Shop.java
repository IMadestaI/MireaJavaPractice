package ru.mirea.PR2.TASK4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<String> computers = new ArrayList<>();
    public Shop(ArrayList<String> array) {
        computers = array;
    }

    // Создаем новый список
    public ArrayList<String> getComputers() {
        return computers;
    }

    public void addComputer(String computerName) {
        computers.add(computerName);
    }

    public void deleteComputer(String computerName) {
        computers.remove(computerName);
    }

    public int findComputer(String computerName){
        return computers.indexOf(computerName);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Computers=" + computers +
                '}';
    }
}
