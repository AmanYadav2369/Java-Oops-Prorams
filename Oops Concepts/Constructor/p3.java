/*  waoojp for class student ( var= rno name marks pn(static), ( methods= student() show() findgrade() ).
*/

class Student
{
private String name;
private int age;
private String city;
private static String s_name="SMDT";

public Student(String name, int age, String city){
this.name=name;
this.age=age;
this.city=city;
}
public void show(){
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("City = "+city);
System.out.println("S_Name = "+s_name);
}}
class p3
{
public static void main(String args[])
{
Student s1=new Student("Aman Yadav",22,"Mumbai");
s1.show();

Student s2=new Student("Amit Yadav",25,"Delhi");
s2.show();



}
}