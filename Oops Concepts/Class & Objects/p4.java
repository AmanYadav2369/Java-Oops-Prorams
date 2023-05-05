//waoojp to initialize the objects by using Constructor...


class Vehicle
{
String name;
String color;
int price;

public Vehicle(String name, String color, int price){
this.name=name;
this.color=color;
this.price=price;
}
public void show(){
System.out.println("Name = "+name);
System.out.println("Color = "+color);
System.out.println("Price = "+price);
}}
class p4
{
public static void main(String args[])
{
Vehicle v1=new Vehicle("honda","black",200);
v1.show();

}
}