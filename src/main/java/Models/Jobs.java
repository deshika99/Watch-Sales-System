package Models;

public class Jobs {

    private String Jobname;
    private String Date;
    private String Email;
    private String Address;
    private int salary;

    public Jobs(String Jobname, String Date, String Email, String Address, int salary) {
        this.Jobname = Jobname;
        this.Date = Date;
        this.Email = Email;
        this.Address = Address;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobname() {
        return Jobname;
    }

    public void setJobname(String Jobname) {
        this.Jobname = Jobname;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
