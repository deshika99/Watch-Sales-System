package Controllers;

import Models.Jobs;

public class jobsController {

    Jobs jobsobj;

    public Jobs addjobs(String Jobname, String Date, String Email, String Address, int salary) {
        jobsobj = new Jobs(Jobname, Date, Email, Address, salary);
        return jobsobj;
    }

}
