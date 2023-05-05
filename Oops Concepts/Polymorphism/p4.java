//waoojp to implement method overriding....

class Rbi
{
void intrest(){
System.out.println("we give 8% intrest...");
}}
class Sbi extends Rbi
{
void intrest(){
System.out.println("we give 6% intrest...");
}}
class Icici extends Rbi
{
void intrest(){
System.out.println("we give 4% intrest...");
}}
class Yes extends Rbi
{
void intrest(){
System.out.println("we give 2% intrest...");
}}
class p4
{
public static void main(String args[])
{
Rbi r=new Rbi();
r.intrest();

Sbi s=new Sbi();
s.intrest();

Icici i=new Icici();
i.intrest();

Yes y=new Yes();
y.intrest();

}
}