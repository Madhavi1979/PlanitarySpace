import java.util.Scanner;
public class thirtysecond {
public static void main(String[] args){
College obj1 = new College();
obj1.duty();
Scanner input = new Scanner(System.in);
System.out.println("\nEnter your Branch: ");
String temp = input.nextLine();
BranchName obj2 = new BranchName(temp);
obj2.duty(); input.close();
} }
class College
{
String Designation = "Student";
String CollegeName = "VIT";
String Place = "Vellore";
void duty()
{
System.out.println("Designation: "+Designation);
System.out.println("College Name: "+CollegeName);
System.out.println("Place: "+Place);
} } class BranchName extends College
{
String Branch;
BranchName(String Branch)
{
this.Branch=Branch;
} void duty()
{
System.out.println("Branch: "+Branch);
super.duty();
}
}
