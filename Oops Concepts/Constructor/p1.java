//waoojp to implement Constructor....

class Animal
{
String name;
int age;
String color;

public Animal(String name, int age, String color){
this.name=name;
this.age=age;
this.color=color;
}
public void show(){
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("Color = "+color);
}}
class p1
{
public static void main(String args[])
{
Animal dog=new Animal("Buzo",5,"black");
dog.show();

}
}