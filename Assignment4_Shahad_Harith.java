package assignment4_shahad_harith;
import java.util.Scanner;
/**
 * @author Shahad Harith
 * 1707861
 * FCIT Library
 */
public class Assignment4_Shahad_Harith {

    public static void main(String[] args) {
        // Read int,double.char
        Scanner input = new Scanner(System.in);
        // Read just String
        Scanner scan = new Scanner(System.in);
        // Just initialize the veriables
        String memberCategory="";
        int ID=1;
        String name ="";
        int days=1;
        int price=1;
        int numberBooks = 1;
        int allowedBooks=1;
        int allowedDays=1;
        //for loop condition
        int ch1=1;
        int ch2=1;
        
         while(ch1==1){
        System.out.println("-------------------------------------------");
        System.out.println("         Welcome to FCIT Library");
        System.out.println("-------------------------------------------");
        
       
        System.out.println("\tEnter \"Borrow\" for Borrowing Books");
        System.out.println("\tEnter \"Return\" for Returning Books");
        System.out.println("\tEnter \"Exit\" for Exiting the program");
        System.out.print("Enter the Choice: ");
        String choice1=scan.nextLine();
        
        switch(choice1){
            
            case "Borrow":
            case "BORROW":
            case "borrow":{
                ch1=2;
            
        
        while(ch2==1){
        System.out.println("");
        System.out.println("\tPress F or f for faculty Member");
        System.out.println("\tPress S or s for Student");
        System.out.print("Enter the Choice: ");
        char choice2=input.next().charAt(0);
        switch(choice2){
            case 'F':
            case 'f':
            ch2=2;
            allowedBooks=12;
            allowedDays=160;
            memberCategory="Faculty Member";
        
        break;
        
            case 'S':
            case 's':
            ch2=2;
            allowedBooks=10;
            allowedDays=90;
            memberCategory="Student       ";
            
        break;
        
        default : ch2=1; System.out.println("Wrong Selection. Please try again!");continue;

        }
        System.out.println("");
        System.out.print("\tEnter the number of books being borrowed: ");
        numberBooks = input.nextInt();
            while (numberBooks>allowedBooks||numberBooks<=0){
        System.out.println("Sorry! Number of books is invalid. Please try again!");
        System.out.println(" ");
        System.out.print("\tEnter the number of books being borrowed: ");
        numberBooks = input.nextInt();
            }
        System.out.print("\tEnter the Name (First and Last): ");
            name = scan.nextLine();
            System.out.print("\tEnter ID: ");
            ID = input.nextInt();
            
        System.out.println("\n\n\t\t\t---------------------------------------------");
        System.out.println("\t\t\t\tInformation Details for BORROWING");
        System.out.println("\t\t\t---------------------------------------------");
        System.out.println("");
        System.out.println("Name\t\t\t: "+name.toUpperCase()+"\t\t\t\tIdentify Number\t\t: "+ID);
        System.out.println("Member Category\t\t: "+memberCategory+"\t\t\tNumber of Borrowed Books : "+numberBooks);
        System.out.println("Number of Allowed Days\t: "+allowedDays+"\t\t\t\t\tNumber of Allowed books\t :"+allowedBooks);
        
        }
        }
            case "Return":
            case "RETURN":
            case "return":{
                ch1=2;
              
        while(ch2==1){
        System.out.println("");
        System.out.println("\tPress F or f for faculty Member");
        System.out.println("\tPress S or s for Student");
        System.out.print("Enter the Choice: ");
        char choice2=input.next().charAt(0);
        switch(choice2){
            case 'F':
            case 'f':ch2=2;
            allowedDays=160;
            allowedBooks=12;
            memberCategory="Faculty Member";
        
        break;
        
            case 'S':
            case 's':
            ch2=2;
            allowedBooks=10;
            allowedDays=90;
            memberCategory="Student       ";
            
        break;
        
            default : ch2=1; System.out.println("Wrong Selection. Please try again!");
      }
        System.out.println("");
        System.out.print("\tEnter the number of books Returning: ");
        numberBooks = input.nextInt();
            while (numberBooks>allowedBooks||numberBooks<=0){
        System.out.println("Sorry! Number of books is invalid. Please try again!");
        System.out.println("");
        System.out.print("\tEnter the number of books Returning: ");
        numberBooks = input.nextInt();
        }
            System.out.print("\tEnter the number of holding days : ");
            days = input.nextInt();
            if(days>allowedDays){
            System.out.print("\tEnter the total Prices of the books : ");
            price = input.nextInt();
            }
            System.out.print("\tEnter the Name (First and Last): ");
            name = scan.nextLine();
            System.out.print("\tEnter ID: ");
            ID = input.nextInt();
            double penality=price*0.2;
        System.out.println("\n\n\t\t\t---------------------------------------------");
        System.out.println("\t\t\t\tInformation Details for RETURNING");
        System.out.println("\t\t\t---------------------------------------------");
        System.out.println("");
        System.out.println("Name\t\t\t: "+name.toUpperCase()+"\t\t\t\tIdentify Number\t\t: "+ID);
        System.out.println("Member Category\t\t: "+memberCategory+"\t\t\tNumber of Borrowed Books: "+numberBooks);
        System.out.println("Number of Allowed Days\t: "+allowedDays+"\t\t\t\t\tNumber of holding days\t: "+days);
        if(days>allowedDays){
        System.out.println("Total Price\t\t: "+price+"\t\t\t\t\tPenality  : "+penality+"SAR");
        System.out.println("You exceeded the allowed period! the penality is \"20%\" of the orginal price of the books.");
        }
        }
          }
        
        break;
        
            case "Exit":
            case "EXIT":
            case "exit":System.exit(0);
            
            default : ch1=1; System.out.println("Wrong Selection. Please try again!");
            }
        }
        
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("                             **Thank you for Visiting**");
    
}
}