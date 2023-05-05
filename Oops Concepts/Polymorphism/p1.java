//waoojp to implement method overloading....

class Math
{

void add(int a, int b){
int res=a+b;
System.out.println("addition of two number is :"+res);
}
void add(int a, int b, int c){
int res=a+b+c;
System.out.println("addition of three number is :"+res);
}

}
class p1
{
public static void main(String args[])
{
Math m=new Math();
m.add(10,20);
m.add(11,22,33);

}
}