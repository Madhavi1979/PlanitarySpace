public class thirtyfirst
{
public static void main(String[] args)
{
LinearEquation obj = new LinearEquation(1,2,2,4,6,6);
if(obj.isSolvable())
{
System.out.println("x: "+obj.getX());
System.out.println("y: "+obj.getX());
}
} } class LinearEquation {
int a,b,c,d,e,f = 0;
LinearEquation(int a,int b,int c,int d,int e,int f)
{ this.a=a; this.b=b; this.c=c; this.d=d; this.e=e; this.f=f;
} boolean isSolvable() {
if(a*d - b*c != 0) {
System.out.println("Solvable Linear Equation"); return true;
} else {
System.out.println("Not Solvable Linear Equation");
return false;
} } double getX()
{ return (e*d - b*f)/(a*d - b*c);
} double getY()
{ return (a*f - e*c)/(a*d - b*c);
}
}
