import java.util.Scanner;
class rectangle {
int length;
int breadth;
int area;
int perimeter;
void input() {
Scanner in = new Scanner(System.in);
System.out.print("Enter length of rectangle: ");
length = in.nextInt();
System.out.print("Enter breadth of rectangle: ");
breadth = in.nextInt();
}
void calculate() {
area = length * breadth;
perimeter = 2 * (length + breadth);
}
void display() {
System.out.println("Area of Rectangle = " + area);
System.out.println("Perimeter of Rectangle = " + perimeter);
}
}
public class twentythird{
public static void main(String args[]) {
rectangle obj = new rectangle();
obj.input();
obj.calculate();
obj.display();
}
}
