/*
 * This class implements a simple program that 
 * will compute the amount of interest that is
 * earned on a $17,000 invested at an interest
 * rate of 0.07 for one year. The interest and
 * the value of investment after one year are
 * printed to the standard output
 */

public class Interest {
    public static void main(String args[])
    {
        /* Declare the variables*/
        
        double principal; // value of the investmet
        double rate; // The annual interest rate
        double interest; // Interest earned in one year
        
        /*Do the computations*/
        
        principal = 17000;
        rate = 0.07;
        interest = principal*rate; // compute the interest
        
        principal = principal + interest;
            //compute value of investment after one year with interest
        
        /* Output the results*/
        
        System.out.println("The interest earned is $" + interest);
        System.out.println("The value of the investment after one year is $" + principal);
    }
}
