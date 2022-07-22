
package staff.salaries.project;

import java.util.Scanner;

public class StaffSalariesProject {
    
    static Details DETAILS_OBJECT = new Details();
    static Scanner ENTER_DETAILS = new Scanner(System.in);
    static int employeeIDNumber;
    static String firstName;
    static String surname;
    static double salary;
    
    public static void main(String[] args) {
        enterDetails();
        printDetails();
        
        System.out.print("Would you like to see the increased salary with "
                + "deductions? Enter (1) to view the deductions "
                + "report or any other key to exit.");
        String option = ENTER_DETAILS.next();
        
        if (option.equals("1"))
        {
            salaryDeductions();
            endProgram();
        } else
        {
            endProgram();
        }
        
    }
    
    // Method for Entering Deatails of the Employees
     private static void enterDetails() {
         
         System.out.print("Enter the employee number >> ");
         employeeIDNumber = ENTER_DETAILS.nextInt();
         DETAILS_OBJECT.setEmployeeIDNumber(employeeIDNumber);
         
         System.out.print("Enter the employee first name >> ");
         firstName = ENTER_DETAILS.next();
         DETAILS_OBJECT.setFirstName(firstName);
        
         
         System.out.print("Enter the employee surname >> ");
         surname = ENTER_DETAILS.next();
         DETAILS_OBJECT.setSurname(surname);
         
         System.out.print("Enter the employee salary to be increased >> ");
         salary = ENTER_DETAILS.nextDouble();
         DETAILS_OBJECT.setSalary(salary);
    }
    
     //To print out the Details for the Employee
    private static void printDetails() {
        
        System.out.print("EMPLOYEE DETAILS REPORT" + "\n"
                + "*********************************" + "\n"
                + "EMPLOYEE NUMBER:\t"   + DETAILS_OBJECT.getEmployeeIDNumber() + "\n"
                + "EMPLOYEE FIRST NAME:\t" + DETAILS_OBJECT.getFirstName() + "\n"
                + "EMPLOYEE SURNAME:\t" + DETAILS_OBJECT.getSurname() + "\n"
                + "ORIGINAL SALARY:\tR " + DETAILS_OBJECT.getSalary() + "\n"
                + "INCREASE SALARY:\tR " + DETAILS_OBJECT.getUpdatedSalary(salary) + "\n"
                + "INCREASED AMOUNT:\tR " + DETAILS_OBJECT.getIncreasedAmount(salary) + "\n"
                + "*********************************" + "\n");
    }
    
    // The Salary Deduction 
    private static void salaryDeductions() {
        
        double tax =  DETAILS_OBJECT.getUpdatedSalary(salary)*0.18;
        double medical = DETAILS_OBJECT.getUpdatedSalary(salary) * 0.125;
        double carAllowance = DETAILS_OBJECT.getUpdatedSalary(salary) * 0.08;
        double UIF = DETAILS_OBJECT.getUpdatedSalary(salary) * 0.02;
        
        double takeHomePay = DETAILS_OBJECT.getUpdatedSalary(salary)- (tax + medical + carAllowance + UIF);
         
          System.out.print("EMPLOYEE DEDUCTIONS REPORT" + "\n"
                + "*********************************" + "\n"
                + "SALARY:\t\tR " + DETAILS_OBJECT.getUpdatedSalary(salary) + "\n"
                + "TAX:\t\tR" + tax + "\n"
                + "MEDICAL AID:\tR" + medical + "\n"
                + "CAR ALLOWANCE:\tR" + carAllowance + "\n"
                + "UIF:\t\tR" + UIF + "\n"
                + "Take Home Pay:\tR" + takeHomePay + "\n"
                + "*********************************" + "\n"
          );
    }

    private static void endProgram() {
       
        System.out.print("\nApplication Complete\n");
    }
    
    
}
