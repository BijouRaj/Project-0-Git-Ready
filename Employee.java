//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the constructor, setters, and getters
//      for the Employee class
//

public class Employee
{
    // Fields for this class
    private String name;
    private EmployeeId employeeId;
    private Date date;

    // Constructor
    public Employee(String name, EmployeeId employeeId, Date date)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.date = date;
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public EmployeeId getEmployeeId()
    {
        return employeeId;
    }

    public Date getDate()
    {
        return date;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmployeeId(EmployeeId employeeId)
    {
        this.employeeId = employeeId;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    // To string override
    @Override
    public String toString()
    {
        return "Name: " + this.name + ", " + this.employeeId + ", " + this.date;
    }
}