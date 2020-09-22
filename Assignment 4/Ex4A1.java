/*
Define a class CricketPlayer (name, no_of_innings, no_times_notout, total_runs, bat_avg).
Create an array of n player objects. Calculate the batting average for each player using a static
method avg(). Handle appropriate exception while calculating average. Define a static method
“sortPlayer” which sorts the array on the basis of average. Display the player details in sorted
order.
*/
import java.util.Scanner;
import java.lang.Exception;

class WrongNumberTimes extends Exception{
    public WrongNumberTimes(final int no_times_notout){
        System.out.println("ERROR:Number of innings cannot be fewer than Number of times not out");
        System.exit(0);
    }
}

class CricketPlayer extends Exception{
    String name;
    int no_of_innings;
    int no_times_notout;
    int total_runs;
    float bat_avg;
    public CricketPlayer(String name,int no_of_innings,int no_times_notout,int total_runs){
        try{
            if(no_of_innings < no_times_notout)
                throw new WrongNumberTimes(no_times_notout);
            if(no_of_innings == 0){
                throw new ArithmeticException();
            }
        }
        
        catch(WrongNumberTimes e){
            //No code
        }

        catch(ArithmeticException e){
            System.out.println("Number of innings cannot be zero");
            System.exit(0);
        }
        this.name = name; 
        this.no_of_innings = no_of_innings;
        this.no_times_notout = no_times_notout;
        this.total_runs = total_runs;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("number of innings: "+no_of_innings);
        System.out.println("Number of times not out: "+no_times_notout);
        System.out.println("total runs: "+total_runs);
        System.out.println("Batting Average: "+bat_avg);
    }
    static void avg(int n,CricketPlayer obj[]){
        for(int i = 0;i < n;i++){
            obj[i].bat_avg = obj[i].total_runs/obj[i].no_of_innings;
        }
    }
    static void sortPlayer(int n,CricketPlayer obj[]){
        CricketPlayer t;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1;j++){
                if(obj[j].bat_avg>obj[j+1].bat_avg){
                    t = obj[j];
                    obj[j] = obj[j+1];
                    obj[j+1] = t;
                }
            }
        }
    }
}

public class Ex4A1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name;
        int no_of_innings;
        int no_times_notout;
        int total_runs;
        
        System.out.println("How many Players?");
        int n = in.nextInt();
        CricketPlayer[] obj = new CricketPlayer[n];

        for(int i = 0;i < n;i++){
        System.out.println("Name: ");
        name = in.next();
        System.out.println("number of innings: ");
        no_of_innings = in.nextInt();
        System.out.println("number of times not out: ");
        no_times_notout = in.nextInt();
        System.out.println("total runs: ");
        total_runs = in.nextInt();
        obj[i] = new CricketPlayer(name,no_of_innings,no_times_notout,total_runs);
        }
        CricketPlayer.avg(n,obj);
        CricketPlayer.sortPlayer(n,obj);
        for(int i = 0;i < n;i++)
        obj[i].display();
        in.close();
    }
}