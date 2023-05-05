//waoojp to initialize the objects by using mehods...

class Student
{
String name;
int age;
String city;

public void setData(String name, int age, String city){
this.name=name;
this.age=age;
this.city=city;
}
public void showData(){
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("City = "+city);
}}
class p3
{
public static void main(String args[])
{
Student s1=new Student();
s1.setData("anil gupta",22,"mumbai");
s1.showData();

}
}