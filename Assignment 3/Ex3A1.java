/*1. Define a class Employee having private members – id, name, department, salary. Define
default and parameterized constructors. Create a subclass called “Manager” with private member
bonus. Define methods accept and display in both the classes. Create n objects of the Manager
class and display the details of the manager having the maximum total salary (salary+bonus)*/
import java.util.*;

public class Ex3A1{
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.println("How many Managers?");
         int n = in.nextInt();
         Manager[] ob = new Manager[n];
         for(int i = 0;i < n;i++){
	    ob[i] = new Manager();
            ob[i].Accept();
            ob[i].Display();
         }
         in.close();
     }
}

class Employee{
         private int Id;
         private String Name;
         private String Department;
         private double Salary;
	 double Total;

         public Employee(){
             Id = 0;
             Name = "__";
             Department = "None";
             Salary = 0.0d;
         }
         
         Scanner in = new Scanner(System.in);
         public Employee(int Employee,String Name,String Department,double Salary){
             this.Name = Name;
             this.Department = Department;
             this.Salary = Salary;
         }
         
         void Accept(){
             System.out.println("Enter Id");
             this.Id = in.nextInt();
             System.out.println("Enter Name");
             this.Name = in.next();
             System.out.println("Enter Department");
             this.Department = in.next();
             System.out.println("Enter Salary");
             this.Salary = in.nextDouble();
        }
        
        void Display(){
            System.out.println("Id: "+Id);
            System.out.println("Name: "+Name);
            System.out.println("Department: "+Department);
            System.out.println("Salary: "+Salary);
        }

    public double Total(double Bonus){
         Total = Salary+Bonus;
         return Total;
        }
     }

class Manager extends Employee{
    private double Bonus;
    double NewSalary;

    public Manager(){
        Bonus = 0;
    }

    public Manager(double Bonus){
        this.Bonus = Bonus;
    }

    void Accept(){
        super.Accept();
        System.out.println("Enter Bonus for Manager:");
        this.Bonus = in.nextDouble();
        NewSalary = super.Total(Bonus);
    }

    void Display(){
        super.Display();
        System.out.println("Bonus: "+Bonus);
        System.out.println("Total Salary: "+NewSalary);
        System.out.println();
    }
}
