//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the constructor, setters, and getters
//      for the Date class
//
public class Date
{
    // Fields for this class
    private String date;
    private String day = "";
    private String month = "";
    private String year = "";
    private int numMonth;
    private int numYear;
    private int numDay;

    public Date(String date)
    {
        // Sets date equal to passed date
        this.date = date;

        // Variables to be used to determine if date is valid
        boolean leapYear;
        int numberofDays, firstOfTheMonth;

        // Extracts day from string
        day += date.charAt(0);
        day += date.charAt(1);
        // Extracts month from string
        month += date.charAt(3);
        month += date.charAt(4);
        // Extracts year from string
        year += date.charAt(6);
        year += date.charAt(7);
        year += date.charAt(8);
        year += date.charAt(9);

        // If valid, sets numDay variable equal to integer value of day
        try {
            numDay = Integer.parseInt(day);
        } catch (NumberFormatException e)
        {
            throw new IllegalArgumentException();
        }

        // If valid, sets numMonth variable equal to integer value of day
        try {
            numMonth = Integer.parseInt(month);
        } catch (NumberFormatException e)
        {
            throw new IllegalArgumentException();
        }

        // If valid, sets numYear variable equal to integer value of year
        try {
            numYear = Integer.parseInt(year);
        } catch (NumberFormatException e)
        {
            throw new IllegalArgumentException();
        }

        // Computes number of days for the month
        numberofDays = getNumberOfDaysInMonth(numMonth, numYear);

        // Determines if year is leap year
        leapYear = isLeapYear(numYear);

        // Throws exception if days entered is out of range of month, if it is a leap
        if (numDay > numberofDays || numMonth <= 0 || numYear <= 0 || numDay <= 0 || numMonth > 12)
        {
            throw new IllegalArgumentException();
        }
    }


    // Method that returns true if year entered is leap year, false otherwise
    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return the number of days in the designated month
    public static int getNumberOfDaysInMonth (int month, int year)
    {
        int numberOfDays;
        switch (month)
        {
            case 4: case 6: case 9: case 11:
                numberOfDays = 30;
                break;
            case 2: 
                numberOfDays = isLeapYear(year) ? 29 : 28;
                break;
            default:
                numberOfDays = 31;
                break;
        }
        return numberOfDays; 
    }

    @Override
    public String toString()
    {
        return "Hire Date: " + String.valueOf(date);
    }
}