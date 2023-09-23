package PR4.TASK1;
// Создаем перечисление для времен года с средней температурой
enum Season {
    SPRING(15),
    SUMMER(25),
    AUTUMN(15),
    WINTER(-15);

    private int temperature;

    // Конструктор для установки средней температуры
    Season(int temperature) {
        this.temperature = temperature;
    }
    // Переопределяем метод getDescription для Лета
    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        }
        return "Холодное время года";
    }

    // Метод для получения средней температуры
    public int getTemperature() {
        return temperature;
    }
    // 2) Метод, использующий оператор switch
    public static void sayFavoriteSeason(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            default:
                System.out.println("Я не знаю, какое время года это.");
                break;
        }
    }
}
class Main
{
    public static void main(String[] args) {
        // Создаем переменную с любимым временем года
        Season mySeason = Season.SUMMER;

        // Выводим информацию о любимом времени года
        System.out.println("Мое любимое время года: " + mySeason);
        System.out.println("Средняя температура: " + mySeason.getTemperature());
        System.out.println("Описание: " + mySeason.getDescription());


        for (Season season : Season.values()) {
            System.out.println("----------------------------");
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getTemperature());
            System.out.println("Описание: " + season.getDescription());
        }
    }
}
