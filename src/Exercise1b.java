import java.util.Scanner;
public class Exercise1b
{
    //this method does not rely on any instance data, so it can be static
    public static void printSumUpTo(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if( i !=n)
                System.out.print(i + " + ");
            else {
                System.out.println(i + " = " + sum);
            }

        }
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I will sum up the integers from 1 to n");
        System.out.println("Enter a value for n: ");
        int n = keyboard.nextInt();
        printSumUpTo(n);
    }
}