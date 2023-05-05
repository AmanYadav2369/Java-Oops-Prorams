//waoojp to implement Abstraction....
//by using abstract class..

abstract class Parent
{
abstract void lb();
abstract void mb();
}
class Child extends Parent
{
void lb(){
System.out.println("lb pay by child..");
}
void mb(){
System.out.println("mb pay by child..");
}
}
class p1
{
public static void main(String args[])
{
Child c=new Child();
c.lb();
c.mb();

}
} 