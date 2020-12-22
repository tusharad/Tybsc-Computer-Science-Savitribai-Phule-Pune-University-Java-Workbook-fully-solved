import java.io.*;
import java.util.Scanner;
public class Ex5A1{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("Please Enter File or directory name!");
			System.exit(0);
		}
		String fname = args[0];
		File f =  new File(fname);
		int num = 0;
		if(f.isDirectory()){
			System.out.println("Given file "+fname+" is a directory");
			System.out.println("List is");
			String[] s = f.list();
			for(int i = 0;i < s.length;i++){
				File f1 = new File(fname,s[i]);
				if(f1.isFile()){
					num++;
					System.out.println("|"+ s[i]);
				}
				else{
					System.out.println("- "+s[i]+" is a sub directory");
				}
			}	
			System.out.println("Number of files are "+num);
			System.out.println("Would you like to delete files with .txt extension?(Y/N)");
			Scanner in = new Scanner(System.in);
			char c = in.next().charAt(0);
			System.out.println("C is "+ c);
			 if(c == 'Y' || c == 'y'){
				int index;
				String extension;
				String[] s2 = f.list();
				for(int i = 0;i < s2.length;i++){
					File f2 = new File(fname,s2[i]);
					index = s2[i].lastIndexOf('.');
					if(index > 0){
						extension = s2[i].substring(index+1);
						if(extension.equals("txt")){
							System.out.println("Test "+extension);
							if(f2.delete()){
								System.out.println("Deleted file: "+ s2[i]);
							}
						}
					}
				}
			}
		}
		else{
			if(f.isFile()){
				System.out.println(fname+" is a file");
				System.out.println("Path: "+f.getPath());
				System.out.println("Size: "+f.length()+" Bytes");
			}
			else
				System.out.println("File does not exists!");
		}
	}
}