//"Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).

// If they enter 0 then stop.

// If he/ she scores :

// Marks >=90 -> print “This is Good”

// 89 >= Marks >= 60 -> print “This is also Good”

// 59 >= Marks >= 0 -> print “This is Good as well”

//         Because marks don’t matter but our effort does. "

import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 for execution or 0 to stop");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Enter marks out of 100");
                 int marks=sc.nextInt();
                 if (marks>=90){
                 System.out.println("This is Good");}
                 else if(marks>=60 && marks<=89){
                 System.out.println("This is also Good");}
                 else if (marks >= 0 && marks <= 59){
                    System.out.println("This is Good as well");}
                 else {
                    System.out.println("Invalid marks");}
                
            } else if (n == 0) {
                System.out.println("Exit");
                break;
            }else {
                System.out.println("Invalid choice");
            }
        }
    }
}