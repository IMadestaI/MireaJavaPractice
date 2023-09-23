package PR3.TASK3;
import java.text.DecimalFormat;


public class Report {
    public static void generateReport(Personal[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.println("----------------------------");
        System.out.println("ФИО                Зарплата");
        System.out.println("----------------------------");

        DecimalFormat df = new DecimalFormat("0.00"); // Формат для двух знаков после запятой

        for (Personal employee : employees) {
            String formattedSalary = df.format(employee.getSalary());
            System.out.printf("%-20s %s%n", employee.getFullName(), formattedSalary);
        }

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Personal[] employees = {
                new Personal("Иван Иванов", 5000.0),
                new Personal("Петр Петров", 6000.0),
                new Personal("Анна Сидорова", 4500.0)
        };

        generateReport(employees);
    }
}
