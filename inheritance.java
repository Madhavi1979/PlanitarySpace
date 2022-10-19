public class thirtythird {
public static void main(String[] args) {
MyFavoriteModel obj = new MyFavoriteModel();
obj.SpeedLimit();
obj.BrandFeatures();
obj.display();
} } class Care
private String VehicleType = "Car";
private int SeatingCapacity = 5;
private String VehicleCategory = "M1";
void display()
{
System.out.println("Vehicle Type: "+VehicleType);
System.out.println("Seating Capacity: "+SeatingCapacity);
System.out.println("Vehicle Category: "+VehicleCategory);
} void SpeedLimit()
{
System.out.println("SpeedLimits: ");
System.out.println("Express highways: 100");
System.out.println("National highways: 80");
System.out.println("Urban Roads: 40");
} } class MyFavoriteBrand extends Car
{
String Brand = "Maruti";
String AvailableColours = "Stone Gray, Silver, Black"; void BrandFeatures()
{
System.out.println("Brand: "+Brand);
System.out.println("Available Colours: "+AvailableColours);
} } class MyFavoriteModel extends MyFavoriteBrand
{ int ModelNumber = 800;
String Colour = "Stone Gray"; void display()
{
super.display();
System.out.println("Model Number: "+ModelNumber);
System.out.println("Colour: "+Colour);
}
} 
