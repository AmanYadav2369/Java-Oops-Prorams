//waoojp to implement all types of Constructors.....


class Demo
{

public Demo(){
System.out.println("This is a No-Argument Constructor....");
}
public Demo(int a){
System.out.println("This is a Parameterized Constructor....");
}

}
class p2
{
public static void main(String args[])
{
//Calling No-Argument Constructor....
Demo d=new Demo();

//Calling Parameterized Constructor....
Demo d1=new Demo(5);

}
}