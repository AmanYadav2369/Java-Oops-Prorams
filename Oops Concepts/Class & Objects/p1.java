//waoojp to implement Class & Object....

class Animal{
String name;
int age;
String color;

public void setData(String name, int age, String color){
this.name=name;
this.age=age;
this.color=color;
}
public void showData(){
System.out.println("Name = " +name);
System.out.println("Age = " +age);
System.out.println("Color = " +color);
}}
class p1{
public static void main(String args[])
{
Animal dog=new Animal();
dog.setData("buzo",5,"black");
dog.showData();

Animal cat=new Animal();
cat.setData("pushi",2,"white");
cat.showData();

}
}