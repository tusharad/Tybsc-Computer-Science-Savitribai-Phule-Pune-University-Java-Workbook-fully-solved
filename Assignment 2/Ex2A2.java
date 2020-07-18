/*
2. Modify the above program to create n objects of the Student class. Accept details from the user
for each object. Define a static method “sortStudent” which sorts the array on the basis of
percentage.
*/
import java.util.Scanner;
public class Ex2A2{
    int RollNumber;
    String Name;
    float Percentage;
    static int count = 0;

    Scanner in = new Scanner(System.in);
    public Ex2A2(){
        count++;
        RollNumber = 0;
        Name = "__";
        Percentage = 0.0f;
    }
    public Ex2A2(int RollNumber,String Name,float Percentage){
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
        Scanner in = new Scanner(System.in);
        int RollNumber;
        String Name;
        float Percentage; 
        System.out.println("How many Students?");
        int n = in.nextInt();
        Ex2A2[] obj = new Ex2A2[n];
       
        for(int i = 0;i < n;i++){
        System.out.println("Enter Roll Number: ");
        RollNumber = in.nextInt();
        System.out.println("Enter Name: ");
        Name = in.next();
        System.out.println("Enter Percentage ");
        Percentage = in.nextFloat();
            obj[i] = new Ex2A2(RollNumber,Name,Percentage);
        }

        for(int j = 0;j < n;j++){
            obj[j].Display();
        }
    
       DisplayCount();
    }

}
