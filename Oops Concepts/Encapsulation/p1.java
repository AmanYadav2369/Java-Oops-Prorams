//waoojp to implement Encapsulation....

class Student
{
private int rno;
private String name;
private int age;
private String city;

public Student(int rno, String name, int age, String city){
this.rno=rno;
this.name=name;
this.age=age;
this.city=city;
}
public void show(){
System.out.println("Rno = "+rno);
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("Ciy = "+city);
}}
class p1
{
public static void main(String args[])
{
Student s1=new Student(45,"Aman Yadav",22,"Mumbai");
s1.show();

}
}