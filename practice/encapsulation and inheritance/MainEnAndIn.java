/*

🧪 Project 1: Student System (Question)
🎯 Goal

Build a Student Management System using:

Encapsulation
Inheritance
📌 Requirements
🔹 1. Create Parent Class: Student
Variables (MUST be private)
name (String)
id (int)
age (int)
Methods (MUST include)
Constructor (set all values)
Getter methods for all variables
Setter methods for all variables

👉 Rule:

Age cannot be negative
If negative → print message
Method:
displayDetails() → print all student details
🔹 2. Create Child Class: NormalStudent

This class must:

Inherit from Student
Use extends
Add method:
attendClass() → print:
"Student is attending class"
🔹 3. Create Child Class: ScholarshipStudent
Extra variable:
scholarshipAmount (double, private)
Methods:
Getter + Setter for scholarshipAmount

👉 Rule:

Cannot be negative
Add method:
displayScholarship()
🔹 4. Main Class

In main():

Create:
1 NormalStudent
1 ScholarshipStudent
Call:
displayDetails()
child class methods

 */


class Student{
    //attributes
    private String name;
    private String id;
    private int age;

    //constructor
    public Student(String name,String id,int age){
        /*
        this.name=name;
        this.id=id;
        this.age=age;
         */
        this.setName(name);
        this.setId(id);
        this.setAge(age);

    }
    public Student(String name,String id){
        this.setName(name);
        this.setId(id);
    }


    //getters & setters
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setAge(int age){
        if (age>0 && age<120) {
            this.age = age;
        }else{
            System.out.println("pls enter a valid age...");
        }
    }
}



class NormalStudent extends Student{
    public NormalStudent(String name,String id,int age){
        super(name,id,age);
    }
    public NormalStudent(String name,String id){
        super(name,id);
    }
    public void attendClass(){
        System.out.println("Student is attending class");
    }
    public void displayDetails(){
        System.out.println("name: "+super.getName()+"\n id: "+super.getId()+"\n age: "+super.getAge());
    }
}


class ScholarshipStudent extends Student{
    private int scholarshipAmount;

    public ScholarshipStudent(String name,String id,int age,int scholarshipAmount){
        super(name,id,age);
        /*
        this.scholarshipAmount=scholarshipAmount;
         */
        this.setScholarshipAmount(scholarshipAmount);

    }
    public int getScholarshipAmount(){
        return(this.scholarshipAmount);
    }
    public void setScholarshipAmount(int scholarshipAmount){
        if (scholarshipAmount>=0 && scholarshipAmount<=100){
            this.scholarshipAmount=scholarshipAmount;
        }else{
            System.out.println("pls input a valid mark...");
        }
    }
    public void displayScholarshipsDetails(){
        System.out.println("name: "+super.getName()+"\n id: "+super.getId()+"\n age: "+super.getAge()+"\n scholarshipAmount: "+this.getScholarshipAmount());
    }
}


public class MainEnAndIn{
    public static void main(String[] args){

        NormalStudent s1=new NormalStudent("vikash","s1",15);
        ScholarshipStudent s2=new ScholarshipStudent("nisura","s2",18,98);
        NormalStudent s3=new NormalStudent("dinil","s3");


        s1.displayDetails();
        System.out.println("***********");
        s2.displayScholarshipsDetails();
        System.out.println("***********");
        s3.displayDetails();
        System.out.println("***********");
        System.out.println("***********");
        s3.setAge(26);
        s3.displayDetails();

    }
}


