
package Controllers;
import Models.Employee;


public class EmployeeController {
    
    Employee employeeObj;
    public Employee addEmployee(int No,String Name,String Date,String Telephone,String Email)
    {
        employeeObj=new Employee(No,Name,Date,Telephone,Email);
        return employeeObj;        
    }
    
    
}
