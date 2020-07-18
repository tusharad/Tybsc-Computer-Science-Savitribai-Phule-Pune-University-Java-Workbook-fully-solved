package Series;

public class Prime {
	int flag;
	public void prime(int n){ 
		for(int i=2;i<n;i++){
			if(n%i==0)
			{
				flag=0;
				break;
			}
			else
				flag=1;
		}
		if(flag==1)
			System.out.println(n+" is a prime number.");
		else System.out.println(n+" is not a prime number.");
	}
	public void fibonacci(int n){
		int first=0, second=1, c, next;
		System.out.println("Fibonacci Series:");
		for(int i=0;i<=n;i++)
		{
			if(i<=1)
				next=i;
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(next);
		}
	}
	public void square(int n){
		System.out.println("Square of the number is "+(n*n));
	}
}
