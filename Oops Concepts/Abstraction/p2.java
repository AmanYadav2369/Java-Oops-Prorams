//waoojp to implement interface...

interface Parent
{

abstract void lb();
abstract void mb();
}
class Child implements Parent
{
public void lb(){
System.out.println("lb will pay by Child...");
}
public void mb(){
System.out.println("mb will pay by Child...");
}}
class p2
{
public static void main(String args[])
{
Child c=new Child();
c.lb();
c.mb();

}
}
