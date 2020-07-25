/*Create an interface”CreditCardInterface” with methods: viewcreditamount(),PayCard(). Create a class “silverCardCustomer”(name, cardnumber)(16 digit), creditamount-initialized to 0, credit limit set to 50,000) which implement above interface. Inherit class GoldCardCustomer from SilverCardCustomer having same method but creditLimit of 1,00,000. Create an object of each class and perform operations. Display appropriate message for success or failure of transaction. ( use method overriding)
a.useCard() method increase the credit amount by a specific amount upto creditLimit.
b.payCredit() reduces the credit Amount by a specific amount.
c. increaseLimit() increase the credit limit for GoldCardCustomer (only 3 times, not mor than 5000 rupees each time.)*/

package Assignment3;

import java.util.*;
interface CreditCard{
                void viewCreditAmount();
                void increaseLimit();
                void useCard();
                void payCard();
}

class SliverCardCustomer implements CreditCard{
                String name;
                int card_no ;
                double creditAmount;
                double creaditLimit;
                static int cnt;
                Scanner in = new Scanner(System.in);

                SliverCardCustomer(){
                                name="Noname" ;
                                card_no=0;
                                creditAmount=0;
                                creaditLimit=50000;
                }

                public void viewCreditAmount(){
                                System.out.println("Your amount is : "+creditAmount) ;
                }

                public void getdata(){
                                System.out.println("Enter the name : ");
                                String name = in.next();
                                System.out.println("Enter the card number :");
                                card_no = in.nextInt();
                                System.out.println("Enter Credit amount : ");
                                creditAmount = in.nextDouble();
                }

                public void payCard(){
                                System.out.println("Enter amount to be pay");
                                double pay = in.nextDouble();
                                creditAmount = creditAmount + pay;
                                System.out.println("Balance is paid");
                }
                public void useCard(){

                                System.out.println("Enter amount : ");
                                double amount = in.nextDouble();
                                if(amount < creditAmount){
                                                creditAmount = creditAmount - amount;
                                                viewCreditAmount();
                                                System.out.println("Thanks for using the service") ;
                                }
                                else System.out.println("\nerror!");
                }

                public void increaseLimit(){
                                cnt++;
                                if(cnt<=3){
                                                System.out.println("Enter amount limit to increse : ");
                                                double amt = in.nextDouble();
                                                if(amt<=2500){
                                                                creaditLimit = creaditLimit + amt;
                                                                System.out.println("Amount limit to increse Successfully : ");
                                                }
                                                System.out.println("You can't increse creadit amount more than 2500 at a time ");

                                }
                                else
                                                System.out.println("You can't increse limit more than 3 times ");
                }
}

class GoldCardCustomer extends SliverCardCustomer {
                static int cnt;
                public void increaseLimit(){
                                cnt++;
                                if(cnt<=3) {
                                                System.out.println("Enter amount limit to increse : ");
                                                double amt = in.nextDouble();
                                                if(amt <= 5000){
                                                                creaditLimit=creaditLimit+amt;
                                                                System.out.println("Amount limit to increse Successfully : ");
                                                }
                                                System.out.println("You can't increse creadit amount more than 2500 at a time ");

                                }
                                else
                                                System.out.println("You can't increse limit more than 3 times ");
                }

}
class Ex3B2 {
                public static void main(String args[]){
                                int ch ;
                                Scanner in = new Scanner(System.in);

                                System.out.println("Enter the info for silver card holder : ");
                                SliverCardCustomer Obj = new SliverCardCustomer();
                                Obj.getdata();

                                System.out.println("Enter the info for Gold card holder : ");
                                GoldCardCustomer Obj2 = new GoldCardCustomer();
                                Obj2.getdata();
                                do {
                                                System.out.println("1.Use silver card \n2.Pay credit for Silver card\n3.Increse limit for silver card ") ;
                                                System.out.println("4.Use Gold card \n5.Pay credit for Gold card\n6.Increse limit for Gold card  ") ;

                                                System.out.println("0. exit") ;
                                                System.out.println("Enter your choice : ") ;
                                                ch = in.nextInt();

                                                switch(ch){
                                                                case 1: Obj.useCard();
                                                                                break;
                                                                case 2: Obj.payCard();
                                                                       break ;
                                                                case 3: Obj.increaseLimit();
                                                                       break;
                                                                case 4: Obj2.useCard();
                                                                       break;
                                                                case 5: Obj2.payCard();
                                                                       break ;
                                                                case 6: Obj2.increaseLimit();
                                                                       break;

                                                                case 0 :break;
                                                }
                                }while(ch != 0);
                                in.close();
                }
}