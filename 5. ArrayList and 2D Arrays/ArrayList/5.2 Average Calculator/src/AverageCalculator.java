import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double sum_array = 0;

        for (int num : numbers) {
            sum_array += num;
        }

        return sum_array / numbers.size();
    }
}