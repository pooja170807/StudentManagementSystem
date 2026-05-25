/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

/**
 *
 * @author Pooja S
 */
import java.util.Scanner;
class student{
    String name;
    int mark1,mark2,mark3,mark4,mark5;
    int tot;
    double avg;
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s = new student();
        System.out.println("----STUDENT MANAGEMENT SYSTEM----\n");
        System.out.print("Enter the Student name : ");
        s.name = sc.nextLine();
        System.out.println("Enter five subject mark:- ");
        System.out.print("Enter Language Mark    : ");
        s.mark1=sc.nextInt();
        System.out.print("Enter English Mark     : ");
        s.mark2=sc.nextInt();
        System.out.print("Enter Maths Mark       : ");
        s.mark3=sc.nextInt();
        System.out.print("Enter Science Mark     : ");
        s.mark4=sc.nextInt();
        System.out.print("Enter Social Mark      : ");
        s.mark5=sc.nextInt();
        System.out.println("\n");
        System.out.println("===================================");
        System.out.println("---STUDENT DETAILS---");
        System.out.println("===================================");
        System.out.println("Student name  : "+s.name+"\n");
        System.out.println("Language Mark : "+s.mark1);
        System.out.println("English Mark  : "+s.mark2);
        System.out.println("Maths Mark    : "+s.mark3);
        System.out.println("Science Mark  : "+s.mark4);
        System.out.println("Social Mark   : "+s.mark5+"\n\n");  
        
        s.tot=s.mark1+s.mark2+s.mark3+s.mark4+s.mark5;
        System.out.println("Total         : "+s.tot);
        s.avg=(s.tot/5);
        System.out.println("Average mark  : "+s.avg);
        if(s.avg>=90){
            System.out.println("Grade     : O");
        }else if(s.avg>=85){
            System.out.println("Grade: A+");
        }else if(s.avg>=80){
            System.out.println("Grade: A");
        }else if(s.avg>=70){
            System.out.println("Grade: B");
        }else if(s.avg>=60){
            System.out.println("Grade: C");
        }else{
            System.out.println("Grade: D");
        }
        if(s.mark1>=34&&s.mark2>=34&&s.mark3>=34&&s.mark4>=34&&s.mark5>=34){
            System.out.println("Reault   : Pass");
        }else{
            System.out.println("Result   : Fail");
        }
       System.out.println("==================================="); 
    }
}
