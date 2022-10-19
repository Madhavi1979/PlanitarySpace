class TV
{
int channel=30;
int volumelevel=4;
boolean on=true;
public void turnOn()
{
on=true;
}
public void turnOff()
{
on=false;
}
public void setChannel(int newChannel)
{
if (on && newChannel>=1 && newChannel<=250)
channel=newChannel;
else
System.out.println("The channel does not exist");
}
public void channelUp()
{
if(on && channel<=250)
channel++;
}
public void channelDown()
{
if(on && channel>=1)
channel--;
}
public void volumeUp()
{
if(on && volumelevel<10)
volumelevel++;
}public void volumeDown()
{
if(on && volumelevel>1)
volumelevel--;
}
}
public class twentyfourth {
public static void main(String[] args)
{
TV tv1 = new TV();
tv1.setChannel(120);
tv1.volumeUp();
tv1.volumeUp();
TV tv2 = new TV();
tv2.setChannel(30);
System.out.println("tv1's channel is "+tv2.channel+" and volume is "+tv2.volumelevel);
System.out.println("tv2's channel is "+tv1.channel+" and volume is "+tv1.volumelevel);
}
}
