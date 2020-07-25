/*1. Define an abstract class “Staff” with members name and address. Define two sub-classes of this
class – “FullTimeStaff” (department, salary) and “PartTimeStaff” (number-of-hours, rate-per-
hour). Define appropriate constructors. Create n objects which could be of either FullTimeStaff
or PartTimeStaff class by asking the user’s choice. Display details of all “FullTimeStaff” objects
and all “PartTimeStaff” objects.*/

package Assignment3;
import java.util.*;

abstract class Staff{
	String Name;
	String Address;
}

class FullTimeStaff extends Staff{
	String Department;
	float Salary;
	
		FullTimeStaff(){
		Name = "__";
		Address = "__";
		Department = "__";
		Salary = 0.0f;
	}
	
	
		FullTimeStaff(String Name,String Address,String Department,float Salary){
		this.Name = Name;
		this.Address = Address;
		this.Department = Department;
		this.Salary = Salary;
	}

	Scanner in = new Scanner(System.in);
	
	void Accept() {
		System.out.println("Enter Name:");
		this.Name = in.next();
		System.out.println("Enter Address:");
		this.Address = in.next();
		System.out.println("Enter Department:");
		this.Department = in.next();
		System.out.println("Enter Salary:");
		this.Salary = in.nextFloat();
	}
	
	void Display() {
		System.out.println("Name: "+ Name);
		System.out.println("Department: "+ Department);
		System.out.println("Address: "+ Address);
		System.out.println("Salary: "+ Salary);
		System.out.println();
	}
}

class PartTimeStaff extends Staff{
	int NumberOfHours;
	float RatePerHour;
	
		PartTimeStaff() {
		Name = "__";
		Address = "__";
		NumberOfHours = 0;
		RatePerHour = 0.0f;
	}
	
		PartTimeStaff(String Name,String Address,int NumberOfHours,float RatePerHour) {
		this.Name = Name;
		this.Address = Address;
		this.NumberOfHours = NumberOfHours;
		this.RatePerHour = RatePerHour;
	}
		 Scanner in = new Scanner(System.in);
		
		void Accept() {
			System.out.println("Enter Name:");
			this.Name = in.next();
			System.out.println("Enter Address:");
			this.Address = in.next();
			System.out.println("Enter Number of Hours:");
			this.NumberOfHours = in.nextInt();
			System.out.println("Enter Rate per Hours:");
			this.RatePerHour = in.nextFloat();
		}
		
		void Display() {
			System.out.println("Name: "+ Name);
			System.out.println("Number of Hours: "+ NumberOfHours);
			System.out.println("Address: "+ Address);
			System.out.println("Rate per hour: "+ RatePerHour);
			System.out.println();
		}
}

public class EX3B1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.Fulltime\n2.Parttime");
		int n = in.nextInt();
		switch(n) {
		
		case 1: 
			System.out.println("How many Employees:");
			int x = in.nextInt();
			FullTimeStaff[] obj = new FullTimeStaff[x];
			
			for(int i = 0;i < x; i++) {
				obj[i] = new FullTimeStaff();
				obj[i].Accept();
			}
			
			for(int i = 0;i < x; i++) {
				obj[i].Display();
			}
			
			break;
			
		case 2:
			System.out.println("How many Employees:");
			int y = in.nextInt();
			PartTimeStaff[] obj2 = new PartTimeStaff[y];
			
			for(int i = 0;i < y; i++) {
				obj2[i] = new PartTimeStaff();
				obj2[i].Accept();
			}
			
			for(int i = 0;i < y; i++) {
				obj2[i].Display();
			}
			break;
		}
		in.close();
	}
}
