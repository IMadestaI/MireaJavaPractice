package PR3.TASK3;

public class Converter
{
    private double exchangeRate;

    public Converter(double exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }
    public double convert(double amount)
    {
        return amount * exchangeRate;
    }
}
// Это раз