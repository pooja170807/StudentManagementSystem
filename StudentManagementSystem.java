/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

/**
 *
 * @author Pooja S
 */
import java.util.Scanner;
class Student{
    String name;
    int mark1,mark2,mark3,mark4,mark5;
    int tot;
    double avg;
    void calcuation(){
        tot=mark1+mark2+mark3+mark4+mark5;
        avg=(tot/5.0);
    }
    void display(){
        System.out.println("===================================");
        System.out.println("---STUDENT DETAILS---");
        System.out.println("===================================");
        System.out.println("Student name  : "+name+"\n");
        System.out.println("Language Mark : "+mark1);
        System.out.println("English Mark  : "+mark2);
        System.out.println("Maths Mark    : "+mark3);
        System.out.println("Science Mark  : "+mark4);
        System.out.println("Social Mark   : "+mark5+"\n\n");  
        
        
        System.out.println("Total         : "+tot);
        
        System.out.println("Average mark  : "+avg);
        if(avg>=90){
            System.out.println("Grade         : O");
        }else if(avg>=85){
            System.out.println("Grade         : A+");
        }else if(avg>=80){
            System.out.println("Grade         : A");
        }else if(avg>=70){
            System.out.println("Grade         : B");
        }else if(avg>=60){
            System.out.println("Grade         : C");
        }else{
            System.out.println("Grade         : D");
        }
        if(mark1>=34&&mark2>=34&&mark3>=34&&mark4>=34&&mark5>=34){
            System.out.println("Result        : Pass");
        }else{
            System.out.println("Result        : Fail");
        }
       System.out.println("==================================="); 
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
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
        s.calcuation();
        s.display();
    }
}
