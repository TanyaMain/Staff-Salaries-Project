package staff.salaries.project;
// Class for Datails for the Employee.
public class Details {
    
    //Datails Employee will enter 
    private int employeeIDNumber;
    private String firstName;
    private String surname;
    private double salary;
    double salPerInc = 0.15;
    
    //Getter and Setter for the datails that the Employee will enter
    
    public int getEmployeeIDNumber(){
        
        return employeeIDNumber;
    }

    public void setEmployeeIDNumber(int employeeIDNumber) {
        this.employeeIDNumber = employeeIDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //the increased amount 
     public double getIncreasedAmount(double salary) {
         
        double salaryIncrease;
        salaryIncrease = salary * salPerInc;
        return salaryIncrease;
     }
    
     //method to update Salaries
    double getUpdatedSalary(double salary){
        
        double salaryIncrease;
        salaryIncrease = salary + (salary * salPerInc);
        return salaryIncrease;
    }
    
}
