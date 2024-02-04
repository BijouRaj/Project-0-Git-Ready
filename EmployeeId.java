//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the constructor, setters, and getters
//      for the EmployeeId class
//

public class EmployeeId
{
    // Fields for this class
    private String digits = "";
    private char letter;
    private char dash;

    public EmployeeId(String id)
    {
        // Array to store the valid letters
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};
        // Boolean flag
        boolean found = false;

        // Stores value from initial string for digits, dash, and letter
        digits += id.charAt(0);
        digits += id.charAt(1);
        digits += id.charAt(2);
        letter = id.charAt(4);
        dash = id.charAt(3);

        // Exception handling to make sure the digits are a valid input
        try {
            Integer.parseInt(digits);
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }

        // Loops through the letters in the array, changing the flag to true if our letter is within the array
        for (char l : letters) {
            if (letter == l){
                found = true;
            }
        }

        // Throws exception if id is not correct number of characters, in the wrong format, or if it does not contain the correct letter
        if (id.length() != 5 || !found || dash != '-')
        {
            throw new IllegalArgumentException();
        }
    }

    // Getter
    public String getEmployeeId()
    {
        return this.digits + "-" + this.letter;
    }

    // To string override
    @Override
    public String toString()
    {
        return "Employee ID: " + String.format(digits + "-" + letter);
    }

    
}