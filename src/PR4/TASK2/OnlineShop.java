package PR4.TASK2;
import java.util.Scanner;
public class OnlineShop
{
    public static void main(String[] args)
    {
                            //Переменные
        UserDatabase database = new UserDatabase(); // Создание бызы данных
        database.addUser("MRX","12345");
        database.addUser("John","John123");
        database.addUser("Molly","54321");
        boolean usernameIsValid = false;
        Scanner scanner = new Scanner(System.in);
        String hello = "Welcome to Internet Shop =)";
                            //Переменные

                            //Авторизация
        System.out.println(hello);
        do
        {
            System.out.print("Enter your username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (database.isValidUser(inputUsername,inputPassword))
            {
                System.out.println("Welcome " + inputUsername + " !");
                usernameIsValid = true;
            }
            else
                System.out.println("The username or password you entered is incorrect\nLet's try Again bro..");
        }
        while (!usernameIsValid);
                            //Авторизация
    }
}
