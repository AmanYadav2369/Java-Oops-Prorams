//waoojp to implement Static method...

class Person
{
String name;
int age;

public void setData(String name, int age){
this.name=name;
this.age=age;
}
public void showData(){
System.out.println("Name = "+name);
System.out.println("Age = "+age);
}
static void Eat(){
System.out.println("person1 is Eating ");
}
static void Run(){
System.out.println("person1 is Running ");
}}
class p2
{
public static void main(String args[])
{
Person p1=new Person();
p1.setData("aman yadav",22);
p1.showData();

Person.Eat();
Person.Run();

}
}