package PR4.TASK2;
import java.util.Map;
import java.util.HashMap;
public class UserDatabase
{
    private Map<String,String> users;
    public UserDatabase() { users = new HashMap<>(); }

    // Добавление нового пользователя
    public boolean addUser(String username, String password)
    {
        if (!users.containsKey(username))
        {
            users.put(username,password);
            return true;
        }
        return false; // Пользователь с таким именем уже существует
    }

    // Проверка логина и пароля
    public boolean isValidUser(String username, String password)
    {
        String storedPassword = users.get(username); //Получение пароля из базы | null
        return storedPassword != null && storedPassword.equals(password); //Проверка пароля
    }

}
