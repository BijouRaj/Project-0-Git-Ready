//
// Name: Raj, Bijou
// Project: #5
// Due: 2023-11-30
// Course: cs-1400-02-sp23
//
// Description:
//      This class contains the main method to implement the classes in this project. Date is in day/month/year format
//

public class CompanyApp
{
    public static void main(String[] args) 
    {
        // Required I/O
        System.out.println("My Company by B. Raj");
        System.out.println();

        // Creates employeeId object and prints
        EmployeeId employeeId = new EmployeeId("654-D");
        System.out.println(employeeId);

        // Creates Date object and prints
        Date date = new Date("31/12/2004");
        System.out.println(date);

        // Creates first Employee and prints information
        Employee employee1 = new Employee("Bob", new EmployeeId("143-M"), new Date("28/02/2023"));
        System.out.println(employee1);

        // Creates Production Worker and prints information
        ProductionWorker employee2 = new ProductionWorker("John", 
        new EmployeeId("142-B"), new Date("01/01/2003"), 1, 384);
        System.out.println(employee2);

        // Creates Shift Supervisor and prints information
        ShiftSupervisor employee3 = new ShiftSupervisor("Josh", 
        new EmployeeId("432-M"), new Date("28/01/2003"), 789, 7);
        System.out.println(employee3);

        // Creates Team Leader and prints information
        TeamLeader employee4 = new TeamLeader("Jane", 
        new EmployeeId("543-D"), new Date("12/12/2013"), 
        2, 89, 234, 54, 12);
        System.out.println(employee4);


    }
}