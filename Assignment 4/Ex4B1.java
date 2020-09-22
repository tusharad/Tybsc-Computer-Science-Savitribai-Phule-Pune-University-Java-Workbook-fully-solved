/*
Define a class MyDate (day, month, year) with methods to accept and display a MyDate
object. Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException”
if the date is invalid.
Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001
*/
import java.lang.Exception;

class InvalidDateException extends Exception{
    private static final long serialVersionUID = 1L;

    public InvalidDateException(int dd, int mm, int yyyy) {
    System.out.println("Invalid Date: "+dd+"/"+mm+"/"+yyyy);
    System.exit(0);
    }
}

class MyDate{
    int dd;
    int mm;
    int yyyy;
    public MyDate(int dd,int mm,int yyyy){
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
        try{
            if(yyyy > 9999 || yyyy < 1800)
                throw new InvalidDateException(dd,mm,yyyy);
            if(mm < 1 || mm > 12)
                throw new InvalidDateException(dd,mm,yyyy);
            if(dd < 1 || dd > 31)
                throw new InvalidDateException(dd,mm,yyyy);
            if(mm == 2){
                if((yyyy%4==0) && (yyyy%100 != 0)){
                    if(dd>=29)
                        throw new InvalidDateException(dd,mm,yyyy);
                }
                else if(dd>=28)
                    throw new InvalidDateException(dd,mm,yyyy);
            }
            if(mm == 4 || mm == 6 || mm == 9 || mm == 11){
                if(dd > 30)
                    throw new InvalidDateException(dd,mm,yyyy);
            }
        }
        catch(InvalidDateException e){
            //No code
        }
    }
    void Display(){
        System.out.println("Date: "+dd+"/"+mm+"/"+yyyy);
    }
}
public class Ex4B1{
     public static void main(String[] args) {
        MyDate obj = new MyDate(30,2,1990);
        obj.Display();
    }
}
