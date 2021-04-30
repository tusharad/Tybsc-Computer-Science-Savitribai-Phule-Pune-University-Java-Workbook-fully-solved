/*
1. Read a text file, specified by the first command line argument, into a list. The
program should then display a menu which performs the following operations on the list:
1. Insert line 2. Delete line 3. Append line 4. Modify line 5. Exit
When the user selects Exit, save the contents of the list to the file and end the program.

*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Ex7c1 {

    static int totalTask;

    void create() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void addList() {
        try {
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename, true); // the true will append the new data
            Scanner in = new Scanner(System.in);
            System.out.println("Enter task to add.");
            StringBuilder data = new StringBuilder(in.nextLine());
            fw.write(data + "\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    void view() {
        int lineNumber = 1;
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            System.out.println("****To Do List****");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(lineNumber + ". " + data);
                lineNumber++;
            }
            System.out.println("**********************");
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    boolean Marked() {
        final String checkMark = "\u2713";
        System.out.println("Enter Task number to be marked:");
        Scanner new_in = new Scanner(System.in);
        int n = new_in.nextInt();
        try {
            Path path = Paths.get("filename.txt");
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            String oldData = Files.readAllLines(path, StandardCharsets.UTF_8).get(n - 1);
            String ch = Character.toString(oldData.charAt(oldData.length() - 1));
            if (!ch.equals("\u2713")) {
                String data = oldData + checkMark;
                lines.set(n - 1, data);
                Files.write(path, lines, StandardCharsets.UTF_8);
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        Ex7c1 obj = new Ex7c1();
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            obj.view();
            System.out.println("1.Create / 2.Add / 3.Mark as Completed / 4.Exit");
            System.out.println("Enter Choice");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    obj.create();
                    break;
                case 2:
                    obj.addList();
                    break;
                case 3:
                    boolean t = obj.Marked();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        in.close();
    }
}
