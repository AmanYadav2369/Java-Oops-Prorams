//waoojp to implement methods....

class Animal
{
String name;
int age;
String color;

public void setData(String name, int age, String color){
this.name=name;
this.age=age;
this.color=color;
}
public void showData(){
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("Color = "+color);
}
void Eat(){
System.out.println(name + " is Eating");
}
void Run(){
System.out.println(name + " is Running");
}}
class p1
{
public static void main(String args[])
{
Animal dog=new Animal();
dog.setData("Buzo",6,"White");
dog.showData();
dog.Eat();
dog.Run();

}
}