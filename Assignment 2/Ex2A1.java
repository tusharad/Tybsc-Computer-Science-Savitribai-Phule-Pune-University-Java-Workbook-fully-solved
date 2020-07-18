/*
1. Define a Student class (roll number, name, percentage). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor and
display the object count after each object is created. (Use static member and method). Also
display the contents of each object.
*/

public class Ex2A1{
    int RollNumber;
    String Name;
    float Percentage;
    static int count = 0;

    public Ex2A1(){
        count++;
        RollNumber = 0;
        Name = "__";
        Percentage = 0.0f;
    }
    public Ex2A1(int RollNumber,String Name,float Percentage){
        count++;
        this.RollNumber = RollNumber;
        this.Name = Name;
        this.Percentage = Percentage;
    }

    void Display(){
        System.out.println("Roll Number: "+ RollNumber);
        System.out.println("Name: "+ Name);
        System.out.println("Percentage: "+ Percentage);
        System.out.println();
    }

    static void DisplayCount(){
        System.out.println("Count is "+count);
    }

    public static void main(String[] args){
        Ex2A1 obj = new Ex2A1();
        Ex2A1 obj2 = new Ex2A1(101,"Tushar",97.03f);
        Ex2A1 obj3 = new Ex2A1(102,"Paras",77.21f);
        obj.Display();
        obj2.Display();
        obj3.Display();
        DisplayCount();
    }

}
