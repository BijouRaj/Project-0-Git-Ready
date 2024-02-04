//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the constructor, setters, and getters
//      for the TeamLeader class
//

public class TeamLeader extends ProductionWorker
{
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    public TeamLeader(String name, EmployeeId employeeId, Date date, int shift, double hourlyPayRate, double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours)
    {
        super(name, employeeId, date, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public double getMonthlyBonus()
    {
        return monthlyBonus;
    }

    public int getRequiredTrainingHours()
    {
        return requiredTrainingHours;
    }

    public int getAttendedTrainingHours()
    {
        return attendedTrainingHours;
    }

    public void setMontlyBonus(double monthlyBonus)
    {
        this.monthlyBonus = monthlyBonus;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours)
    {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours)
    {
        this.attendedTrainingHours = attendedTrainingHours;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", " + "Monthly Bonus: $" + String.format("%.2f", this.monthlyBonus) + ", " 
        + "Required Training Hours: " + this.requiredTrainingHours + ", " + "Attended Training Hours: " + this.attendedTrainingHours;
    }
}