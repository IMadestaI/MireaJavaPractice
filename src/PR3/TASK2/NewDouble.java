package PR3.TASK2;

import java.lang.*;
import java.sql.SQLOutput;

public class NewDouble
{
    public static void main(String[] args)
    {
        Double doubleValue = Double.valueOf(5.5);
        System.out.println(doubleValue);
        String stringValue = "6.6";
        double num = Double.parseDouble(stringValue);
        System.out.println(num + 1);
        // Создаем объект класса Double
        Double doubleObject = 3.14159265359;

// Преобразование к примитивным типам
        double primitiveDouble = doubleObject.doubleValue();
        int primitiveInt = doubleObject.intValue();
        float primitiveFloat = doubleObject.floatValue();
        long primitiveLong = doubleObject.longValue();
        short primitiveShort = doubleObject.shortValue();
        byte primitiveByte = doubleObject.byteValue();

// Вывод результатов
        System.out.println("double: " + primitiveDouble);
        System.out.println("int: " + primitiveInt);
        System.out.println("float: " + primitiveFloat);
        System.out.println("long: " + primitiveLong);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
