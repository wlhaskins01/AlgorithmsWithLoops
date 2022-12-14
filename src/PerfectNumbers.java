public class PerfectNumbers
{
    //This method is static because it does not use or depend on on any instance variables.
    public static boolean isPerfect(int number)
    {
        //code to determine whether the parameter value store in number is a perfect number.
        //this code involves a loop
        //returns true or false
        if (number == 1)
            return false;
        int sum = 1;
        for( int i = 2 ; i< number; i++){
            if(number%i == 0){
                sum+=i;
            }
        }
        return(sum == number);
    }
    public static void main(String[] args)
    {
        int number = 0;
        int isFour = 0;

        while(isFour<4) {
            number++;
            if (isPerfect(number)) {
                System.out.print(number + " ,");
                isFour++;
            }

            // a loop in the main function that goes through a range of numbers,
            // checking each one to see if it is a perfect number, and printing it if it is.
            // until 4 perfect numbers have been displayed.
        }
    }
}