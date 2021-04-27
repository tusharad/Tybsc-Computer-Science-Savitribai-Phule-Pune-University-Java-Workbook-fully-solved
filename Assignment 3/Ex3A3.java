/*3. Write a Java program to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle
(members – capacity-in-tons). Accept the information for n vehicles and display the information
in appropriate form. While taking data, ask the user about the type of vehicle first.*/

import java.util.*;
public class Ex3A3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the type of vehicle");
        System.out.println("1.Light Vehicle");
        System.out.println("2.Heavy Vehicle");
        int ch = in.nextInt();

        switch(ch){
        case 1: 
	int i;
        System.out.println("Enter the number of Light vehicles: ");
        int n = in.nextInt();
        Light[] ObjLight = new Light[n];
        for(i = 0; i < n;i++){
        ObjLight[i] = new Light();
        ObjLight[i].accept();
        }
        for( i = 0;i < n;i++){
        ObjLight[i].display();
        }
        break;

        case 2:
        int j;	
        System.out.println("Enter the number of Heavy vehicles: ");
        int m = in.nextInt();
        Heavy[] ObjHeavy = new Heavy[m];
        for(j = 0; j < m;j++){
        ObjHeavy[j] = new Heavy();
        ObjHeavy[j].accept();
        }
        for(j = 0;j < m;j++){
        ObjHeavy[j].display();
        }
        break;

        }
        in.close();
    }
}

class Vehicle{ 
 String company;
 double price;
 Scanner in = new Scanner(System.in);
 
  public void accept(){
  System.out.println("Enter the Company and price of the Vehicle: ");
  company = in.next();
  price = in.nextDouble();
  }

  public void display(){
  System.out.println("Company: "+company+" Price: "+price);
 }
}

class Light extends Vehicle{
 double mileage;
 Scanner in = new Scanner(System.in);

  public void accept(){
  super.accept();
  System.out.println("Enter the mileage of the vehicle: ");
  mileage = in.nextDouble();
  }

  public void display(){
  super.display();
  System.out.println("Mileage: "+mileage);
  }
}

class Heavy extends Vehicle{
 double captons;
 Scanner in = new Scanner(System.in);

  public void accept(){
  super.accept();
  System.out.println("Enter the capacity in tons:");
  captons = in.nextDouble();
  }

  public void display(){
  super.display();
  System.out.println("Capacity in tons: "+captons);
  }
}
