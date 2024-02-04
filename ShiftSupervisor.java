//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the constructor, setters, and getters
//      for the ShiftSupervisor class
//

public class ShiftSupervisor extends Employee
{
    private double annualSalary;
    private double productionBonus;

    public ShiftSupervisor(String name, EmployeeId employeeId, Date date, double annualSalary, double productionBonus)
    {
        super(name, employeeId, date);
        this.annualSalary = annualSalary;
        this.productionBonus = productionBonus;
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public double getProductionBonus()
    {
        return productionBonus;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public void setProductionBonus(double productionBonus)
    {
        this.productionBonus = productionBonus;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Annual Salary: $" + String.format("%.2f", this.annualSalary) + ", " +
         "Production Bonus: $" + String.format("%.2f", this.productionBonus);
    }
}