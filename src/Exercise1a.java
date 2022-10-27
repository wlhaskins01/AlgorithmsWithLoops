    import java.util.Scanner;
    public class Exercise1a
    {
        //this method does not rely on any instance data, so it can be static
        public static int addOdds(int n) {

            int sumOfOdd=0;
            for (int  i= 0; i <= n; i++) {
                if (i%2==1){
                    sumOfOdd += i;
                }
                ; //replace this line obviously
            }
            return sumOfOdd;

        }
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter an integer.  Then I will give you " +
                    "the sum of the odds up to that integer: ");
            int input = keyboard.nextInt();
            System.out.println("The sum of the odds up to " + input + " is " + addOdds(input));
        }
    }

