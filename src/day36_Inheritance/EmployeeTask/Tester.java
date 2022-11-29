package day36_Inheritance.EmployeeTask;

public class Tester extends Employee{
    public void setInfo() {
    }
    public void testing(){
        System.out.println(getName()+" is testing");
    }
    public void CreatingTicket(){
        System.out.println(getName()+" is Creating Tickets");
    }


}
/*
2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */