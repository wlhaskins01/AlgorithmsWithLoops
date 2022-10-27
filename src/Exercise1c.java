import java.util.Scanner;
public class Exercise1c
{
    //this method does not rely on any instance data, so it can be static
    public static boolean isPerfectSquare(int num)
    {
        int sum = 0;
        boolean isTrue;
        for(int i = 0; sum < num; i++){
            if(i%2!=0) {
                sum +=i;
            }

        }
        return sum==num;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number and I will tell you if it is a perfect square: ");
        int test = keyboard.nextInt();
        if (isPerfectSquare(test))
            System.out.println("Yes, " + test + " is a perfect square.");
        else
            System.out.println("No, " + test + " is NOT a perfect square.");
    }
}