public class Task1Test
{
    public static void main(String[] args) 
    {
        GreaterThan100();
        EqualTo100();
        LessThan100();
        SameNumbers();
    }

    public static void GreaterThan100() 
    {
        int result = (int) Calculation(70, 90);
        if (result == 160) 
        {
            System.out.println(" Greater than 100 test is passed");
        } 
        else 
        {
            System.out.println(" Greater than 100 test is failed");
        }
    }

    public static void EqualTo100() {
        int result = (int) Calculation(40, 60);
        if (result == 2400) 
        {
            System.out.println(" Equal to 100 test is  passed");
        } else {
            System.out.println(" Equal to 100 test is failed");
        }
    }

    public static void LessThan100() 
    {
        int result = (int) Calculation(50, 40);
        if (result == 10) 
        {
            System.out.println("Less than 100 test is passed");
        } 
        else 
        {
            System.out.println("Less than 100 test is failed");
        }
    }

    public static void SameNumbers() 
    {
        int result = (int) Calculation(40, 40);
        if (result == 0) 
        {
            System.out.println(" Same Numbers test is passed");
        } 
        else 
        {
            System.out.println(" Same Numbers test is failed");
        }
    }


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