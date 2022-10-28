public class Fibonacci
{

//This method is static because it does not use or depend on on any instance variables.

    public static int fibonacci(int n)
    {
        int term1 = 0; //assign an initial value here
        int term2 = 1; //assign an initial value here
        int sum = 1; //assign an initial value here

        //code to calculate the nth term in the fibonacci sequence

        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Fibonacci sequence first 10 terms: ");
        for (int n = 1; n<=10; n++)
            System.out.println(fibonacci(n));
    }
}