//waoojp to implement method overriding...

class A
{

void compute(double n){
double res=n*n;
System.out.println("square is "+res);
}}
class B extends A
{

void compute(double n){
double res=n*n*n;
System.out.println("cube is "+res);
}}
class p3
{
public static void main(String args[])
{
A a=new A();
a.compute(6);

B b=new B();
b.compute(5);

}
}