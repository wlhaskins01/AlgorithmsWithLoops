public class Fibonacci
{

//This method is static because it does not use or depend on any instance variables.

    public static int fibonacci(int n)
    {


        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);

        //while (count < n)


        //code to calculate the nth term in the fibonacci sequence

        //return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Fibonacci sequence first 10 terms: ");
        for (int n = 1; n<=10; n++)
            System.out.println(fibonacci(n));
    }
}