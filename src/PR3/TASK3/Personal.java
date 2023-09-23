package PR3.TASK3;
public class Personal
{
    private String fullName;
    private double salary;
    public Personal(String fullName, double salary)
    {
        this.fullName = fullName;
        this.salary = salary;
    }
    public String getFullName()
    {
        return fullName;
    }
    public double getSalary()
    {
        return salary;
    }
}