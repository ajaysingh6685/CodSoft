import java.util.*;

class Student_Grade_Calculator
{
public static void main(String args[])
{
     int english, physics, chemistry, maths, hindi; 
     double total, percentage;
    Scanner sc=new Scanner(System.in);
    // Input marks of all five subjects 
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subjects:");
    english=sc.nextInt();
    System.out.print("Enter marks of physics subjects:");
    physics=sc.nextInt();
    System.out.print("Enter marks of chemistry subjects:");
    chemistry=sc.nextInt();
    System.out.print("Enter marks of maths subjects:");
    maths=sc.nextInt();
    System.out.print("Enter marks of Hindi subjects:");
    hindi=sc.nextInt();

   //  Calculate total, average and percentage 
    total = english + physics + chemistry + maths + hindi;
    percentage = (total / 500) * 100;

   
   //   Print all results 
    System.out.println("Total marks ="+total);
 
    System.out.println("Average Percentage = "+percentage);

     // Grades of the studnets
    if(percentage<=100 && percentage>90){
      System.out.println("Grade: A");
    }
    else if(percentage<=90 && percentage>80){
      System.out.println("Grade: B");
    }
    else if(percentage<=80 && percentage>70){
      System.out.println("Grade: C");
    }
    else if(percentage<=70 && percentage>60){
      System.out.println("Grade: D");
    } 
    else if(percentage<=60 && percentage>50){
      System.out.println("Grade: E");
    } 
    else{
      System.out.println(" Student get fail");
    }
   }
}