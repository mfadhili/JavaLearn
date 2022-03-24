public class EnumDemo{
    
    // Define two enum types outside the main() routine
    
    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
    
    public static void main(String args[])
    {
        Day tgif;     // Declare the variable for day
        Month mnth; // Declare the variable for month
        
        tgif = Day.FRIDAY; // Asssign value of type Day
        mnth = Month.MAY; // Asssign value of type Month
        
        System.out.print("My birthday is in the month of ");
        System.out.println(mnth);
        System.out.print("That is the ");
        System.out.print(mnth.ordinal() + 1);
        System.out.println("-th month of the year. ");
        
        System.out.println(tgif + "is the " + (tgif.ordinal()+1) + "-th day of the week");
                
    }
}
