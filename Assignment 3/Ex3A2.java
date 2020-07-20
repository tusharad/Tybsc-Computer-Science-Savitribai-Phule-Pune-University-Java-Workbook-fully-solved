/*2. Create an abstract class Shape with methods calc_area and calc_volume. Derive three classes
Sphere(radius) , Cone(radius, height) and Cylinder(radius, height), Box(length, breadth, height)
from it. Calculate area and volume of all. (Use Method overriding).*/
import java.util.*;

abstract class Shape{
    abstract public void calc_area();
    abstract public void calc_volume();
    final double PI = 3.14;
}

class Sphere extends Shape{
    int Radius;
    private double Area;
    private double Volume;
    Scanner in = new Scanner(System.in);
    void Accept(){
    System.out.println("Enter Radius:");
    Radius = in.nextInt();
    }

    public void calc_area(){
        Area = PI*Radius*Radius;
    }

    public void calc_volume(){
        Volume = 1.33333333334*PI*Radius*Radius*Radius;
    }

    void Display(){
        calc_area();
        calc_volume();
        System.out.println("Area of Sphere: "+ Area);
        System.out.println("Volume of Spehere: "+Volume);
    }
}

class Cylinder extends Shape{
    double Radius,Height;

    private double Area;
    private double Volume;
    Scanner in = new Scanner(System.in);
    void Accept(){
    System.out.println("Enter Radius:");
    Radius = in.nextDouble();
    System.out.println("Enter Height:");
    Height = in.nextDouble();
    }

    public void calc_area(){
        Area = (2*PI*Radius*Height)+(2*PI*Radius*Radius);
    }

    public void calc_volume(){
        Volume = PI*Radius*Radius*Height;
    }

    void Display(){
        calc_area();
        calc_volume();
        System.out.println("Area of Cylinder: "+ Area);
        System.out.println("Volume of Cylinder: "+Volume);
    }
}

class Clone extends Shape{
    double Radius,Height;
    private double Area;
    private double Volume;
    Scanner in = new Scanner(System.in);
    void Accept(){
    System.out.println("Enter Radius:");
    Radius = in.nextDouble();
    System.out.println("Enter Height:");
    Height = in.nextDouble();
    }

    public void calc_area(){
        Area = Height*Height+Radius*Radius;
    }

    public void calc_volume(){
        Volume = PI*Radius*Radius*(Height/3);
    }

    void Display(){
        calc_area();
        calc_volume();
        System.out.println("Area of Cone: "+ Area);
        System.out.println("Volume of Cone: "+Volume);
    }
}

class Box extends Shape{
    double Radius,Height,Breadth,Length;
    private double Area;
    private double Volume;
    Scanner in = new Scanner(System.in);
    void Accept(){
    System.out.println("Enter Radius:");
    Radius = in.nextDouble();
    System.out.println("Enter Height:");
    Height = in.nextDouble();
    System.out.println("Enter Breadth:");
    Breadth = in.nextDouble();
    System.out.println("Enter Length:");
    Length = in.nextDouble();

    }

    public void calc_area(){
        Area = (2*Length*Breadth)+(2*Breadth*Height)+(2*Length*Height);
    }

    public void calc_volume(){
        Volume = Length*Breadth*Height;
    }

    void Display(){
        calc_area();
        calc_volume();
        System.out.println("Area of Box: "+ Area);
        System.out.println("Volume of Box: "+Volume);
    }
}

public class Ex3A2{
    public static void main(String[] args){
        Sphere Obj = new Sphere();
        Obj.Accept();
        Obj.Display();
        Clone Obj2 = new Clone();
        Obj2.Accept();
        Obj2.Display();
        Cylinder Obj3 = new Cylinder();
        Obj3.Accept();
        Obj3.Display();
        Box Obj4 = new Box();
        Obj4.Accept();
        Obj4.Display();
    }
}
