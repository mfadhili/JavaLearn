/*
 * This program performs some mathematical computaions an displays 
 * the results. It then reports the number of seconds that the 
 * computer spent on this task
 */

public class TimedComputation{
    public static void main(String args[])
    {
        long startTime; //Starting time of the program in milliseconds
        long endTime; // Time when computaions are done in milliseconds
        double time; // Time difference in seconds
        
        startTime = System.currentTimeMillis();
        
        double width, height, hypotenuse; // sides of a triangle
        width = 42.0;
        height = 17.0;
        hypotenuse = Math.sqrt(width*width + height*height);
        
        System.out.print("A triangle with sides " + width + " and " + height + "has hypotenuse ");
        System.out.println(hypotenuse);
        
        System.out.println("Let's check this for x = 1: ");
        System.out.print("  sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
        System.out.println(Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) + -1);
        System.out.println("(There can be round-off errors when" + " computing with real numbers!)");
        
        System.out.print("\nHere is a random number: ");
        System.out.println(Math.random());
        
        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000;
        
        System.out.print("\nRun time in seconds was: ");
        System.out.println(time);
        
    } // end main()
} // end class TimedComputation
