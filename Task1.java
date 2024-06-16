public class Task1 
{
    public static Object Calculation(int num1, int num2) 
    {
        if (num1 <= 0 || num2 <= 0) 
        {
            return "Error";
        }
        int sum = num1 + num2;

        if (sum > 100) 
        {
            return sum;
        }
        else if (sum == 100)
        {
            return num1 * num2;
        } 
        else 
        {
            return Math.abs(num1 - num2);
        }
    }
}