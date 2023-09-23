package PR3.TASK3;
import java.util.Scanner;
public class OnlineShop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        System.out.print("Введите курс обмена: ");
        double exchangeRate = scanner.nextDouble();

        Converter converter = new Converter(exchangeRate);

        System.out.print("Выберите валюту (USD/EUR): ");
        String currency = scanner.next();

        if (currency.equalsIgnoreCase("USD"))
        {
            double totalPrice = converter.convert(price);
            System.out.println("Стоимость в USD: " + totalPrice);
        }
        else if (currency.equalsIgnoreCase("EUR"))
        {
            double totalPrice = converter.convert(price);
            System.out.println("Стоимость в EUR: ");
        }
        else
            System.out.println("Неверная валюта.");
    }
}
//Это три

