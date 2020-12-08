package MuhtarOnly.EmployeesInfo;

public class Employees {
    public String name;
    public char gender;
    public int SSN;
    public String ID;
    public String jobTitle;
    public String companyName;
    public double salary;

    public void setInfo(String empName, char empGender, int empSSN, String empID, String empJobTitle, String empCompanyName, double empSalary) {
        name = empName;
        gender = empGender;
        SSN = empSSN;
        ID = empID;
        jobTitle = empJobTitle;
        companyName = empCompanyName;
        salary = empSalary;
    }

    public void getInfo() {
        System.out.println("Employee name is "+name + ", gender is " + gender + ", SSN: " + SSN + ", ID: " + ID + ", JobTitle is " + jobTitle + ", Company Name is " + companyName + ", and yearly salary $" + salary);
    }

    public void attendMeeting() {
        System.out.println("Attend meeting..");
    }

    public void working() {
        System.out.println("Working, as usually..");
    }
}
