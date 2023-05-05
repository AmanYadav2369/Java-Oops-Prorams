//waoojp to implement method overloading....

class Compute
{

void Person(){
System.out.println("he is a teacher...");
}
void Person(int a){
System.out.println("he is a student...");
}

}
class p2
{
public static void main(String args[])
{
Compute c=new Compute();
c.Person();
c.Person(5);


}
}