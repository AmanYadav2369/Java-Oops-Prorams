//waoojp to implement access modifiers...

class Student
{
private String name;
private int age;
private String city;

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
class p1
{
public static void main(String args[])
{
Student s1=new Student();
s1.setData("Aman",22,"Mumbai");
s1.showData();

}
}