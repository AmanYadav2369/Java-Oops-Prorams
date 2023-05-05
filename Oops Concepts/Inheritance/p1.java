//waoojp to implement Inheritance....

class Person
{
private String name;
private int age;

public Person(String name, int age){
this.name=name;
this.age=age;
}
public void show(){
System.out.println("Name = "+name);
System.out.println("Age = "+age);
}}
class Student extends Person
{
private int rno;
private int marks;

public Student(String name, int age, int rno, int marks){
super(name, age);
this.rno=rno;
this.marks=marks;
}
public void show(){
super.show();
System.out.println("Rno = "+rno);
System.out.println("Marks = "+marks);
}
void FindGrade(){
if(marks>80)	System.out.println("Grade A");
else if(marks>60)	System.out.println("Grade B");
else if(marks>40)	System.out.println("Grade C");
else 		System.out.println("Grade D");
}}
class p1
{
public static void main(String args[])
{
Student s1=new Student("Aman Yadav",25,55,95);
s1.show();
s1.FindGrade();
}
}