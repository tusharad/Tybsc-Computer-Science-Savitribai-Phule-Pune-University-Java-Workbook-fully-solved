import java.io.*;
import java.util.Scanner;

public class Ex5A3{
	File f;
	static final String fname = "item.dat";

	Ex5A3(String fname){
		 this.f = new File(fname);
		if(!(f.isFile())){
			System.out.println("Where is item.dat?");
			System.exit(0);
		}
	}

	String Search(String item){
		try{
		Scanner reader = new Scanner(this.f);
		String str;
		item = item.toLowerCase();
		String[] strArray = new String[4];
		while(reader.hasNextLine()){
			str = reader.nextLine();
			strArray = str.split("-",4);
			System.out.println(strArray[1]);
			if(strArray[1].equals(item))
				return str;
		}
		return "Sorry! Nothing Found!";
	}
	catch (FileNotFoundException ex){
		System.exit(0);
	}
	return "_";
	}

	String Costliest(){
		try{
		Scanner reader = new Scanner(f);
		String str;
		String[] strArray = new String[4];
		int max = 0;
		String res = new String();
		reader.nextLine();
		while(reader.hasNextLine()){
			str = reader.nextLine();
			strArray = str.split("-",4);
			if(max < Integer.parseInt(strArray[2])){
				max = Integer.parseInt(strArray[2]);
				res = strArray[2];
			}
		}
		return res;
	}
	catch (FileNotFoundException ex){
		System.exit(0);
	}
	return "_";
	}
	
	void DisplayAll(){
		try{
		Scanner reader = new Scanner(f);
		String s;
		int sum = 0;
		int mul;
		String[] strArray = new String[4];
		String[] strArray2 = new String[4];
		while(reader.hasNextLine()){
			s = reader.nextLine();
			strArray = s.split("-",4);
			if(!strArray[2].equals("price")){
			mul = Integer.parseInt(strArray[2])*Integer.parseInt(strArray[3]);
			sum = sum + mul;
			}
			System.out.println(s);
		}
		System.out.println("Total Cost: "+sum);
	}
		catch (FileNotFoundException ex){
		System.exit(0);
	}
	}
	public static void main(String[] args){
		
		
		Ex5A3 obj = new Ex5A3(fname);
		String item;
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("******Menu******");
			System.out.println("1.Search for Specific item by name");
			System.out.println("2. Find costliest item.");
			System.out.println("3.Display all items and total cost");
			System.out.println("4.Exit");
			System.out.println("Select option:");
			int choice = in.nextInt();
			switch(choice){
				case 1: 
					System.out.println("Enter Name of item");
					item = in.next();
					System.out.println(obj.Search(item));
				break;

				case 2:
					System.out.println(obj.Costliest());
				break;

				case 3: 
					obj.DisplayAll();
				break;

				case 4:
					System.exit(0);
				break;

				default:
					System.out.println("Invalid Option!");
				break; 
			}
		}
	}
}