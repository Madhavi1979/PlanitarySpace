public class thirty
{
public static void main(String[] args)
{
Circles[] circle_array = new Circles[20];
for(int i=0; i<20; i++)
{ circle_array[i] = new Circles(Math.random()*100); circle_array[i].display();
}
} } class Circles {
double area,perimeter,radius; Circles(double r)
{
radius=r;
area=Math.PI*(r*r);
perimeter=2*Math.PI*(r);
}
public void display()
{
System.out.println("Area of circle with radius"+radius+ "is"+area);
System.out.println("Perimeter of circle with radius"+radius+ "is"+perimeter);
}
}
