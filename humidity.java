import java.util.Scanner;
public class twentyfirst {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double mat[][][] = new double[3][4][2];
double avg_temp=0;
double avg_hum=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
System.out.println("Enter the temperature of "+((j+1)*6)+"th hour of day "+(i+1));
mat[i][j][0]=sc.nextDouble();
System.out.println("Enter the humidity of "+((j+1)*6)+"th hour of day "+(i+1));
mat[i][j][1]=sc.nextDouble();
avg_temp+=mat[i][j][0];
avg_hum+=mat[i][j][1];
}
}
avg_temp/=12;
avg_hum/=12;
System.out.println("Average temperature is "+avg_temp+" degree celcius and humidity is "+avg_hum+" %");
}
}
