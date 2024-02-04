//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the constructor, setters, and getters
//      for the ProductionWorker class
//

public class ProductionWorker extends Employee
{
    private int shift;
    private double hourlyPayRate;


    public ProductionWorker(String name, EmployeeId employeeId, Date date, int shift, double hourlyPayRate)
    {
        super(name, employeeId, date);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public String getShift()
    {
        return (shift == 1) ? "Day Shift" : "Night Shift";
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setShift(int shift)
    {
        this.shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Shift: " + getShift() + ", " + "Hourly Pay Rate: $" +
         String.format("%.2f", this.hourlyPayRate);
    }

}