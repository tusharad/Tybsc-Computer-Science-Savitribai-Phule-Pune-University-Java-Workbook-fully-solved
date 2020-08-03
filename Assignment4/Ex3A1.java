/*
Define a class CricketPlayer (name, no_of_innings, no_times_notout, total_runs, bat_avg).
Create an array of n player objects. Calculate the batting average for each player using a static
method avg(). Handle appropriate exception while calculating average. Define a static method
“sortPlayer” which sorts the array on the basis of average. Display the player details in sorted
order.
 */
package Assignment4;
import java.util.Scanner;

class Cricket{
	String name;
	int innings, tofnotout, totalruns;
	float batAvg;
	
	Scanner in = new Scanner(System.in);
	public Cricket(){
		name = null;
		innings = 0;
		tofnotout = 0;
		totalruns = 0;
		batAvg = 0;
	}
	
	public void Accept() {
		System.out.println("Enter the name, no of innings, no of times not out, total runs: ");
		  name = in.nextLine();
		  innings = in.nextInt();
		  tofnotout = in.nextInt();
		  totalruns = in.nextInt();
	}
	
	public void Display() {
		System.out.println("Name="+name);
		  System.out.println("no of innings="+innings);
		  System.out.println("no times notout="+tofnotout);
		  System.out.println("total runs="+totalruns);
		  System.out.println("bat avg="+batAvg);
		  System.out.println();
	}
	
	static void avg(int n,Cricket c[]) {
		try {
			for(int i = 0;i < n;i++) {
				 c[i].batAvg=c[i].totalruns/c[i].innings;
			}
		}
		catch(ArithmeticException e){
			System.out.println("Invalid arg");
		}
	}
	
	static void sort(int n, Cricket c[]){
		  
		  String temp1;
		  int temp2,temp3,temp4;
		  float temp5;
		  
		  for(int i=0;i<n;i++)
		   for(int j=i+1;j<n;j++)
		   
			 if(c[i].batAvg<c[j].batAvg){
		     temp1=c[i].name;
		     c[i].name = c[j].name;
		     c[j].name = temp1;
		     
		     temp2 = c[i].innings;
		     c[i].innings = c[j].innings;
		     c[j].innings = temp2;
		     
		     temp3=c[i].tofnotout;
		     c[i].tofnotout = c[j].tofnotout;
		     c[j].tofnotout = temp3;
		     
		     temp4 = c[i].totalruns;
		     c[i].totalruns = c[j].totalruns;
		     c[j].totalruns = temp4;
		     
		     temp5=c[i].batAvg;
		     c[i].batAvg = c[j].batAvg;
		     c[j].batAvg = temp5;
		    }
		  }
	
}

public class Ex3A1 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the limit:");
		 int n = in.nextInt(); 
		 Cricket c[] = new Cricket[n];
		
		  for(int i=0;i<n;i++){
		   c[i] = new Cricket();
		   c[i].Accept();
		  }
		 
		  Cricket.avg(n,c);
		  Cricket.sort(n, c);
		  
		  for(int i=0;i<n;i++){
		   c[i].Display();
		 }
		in.close();
	 }
}
