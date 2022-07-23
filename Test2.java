package mypackage;
   
class Bicycle {
	 
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed)
	{
	this.gear = gear;
	this.speed = speed;
	}
	public void applyBreake(int decrement)
	{
		speed-= decrement;
	}
	public void speedUp(int increment)
	{
		speed+= increment;
	}
	public String toString()
	{
		return("No. of gears are "+ gear +"\n" +
	"speed of bicycle is " + speed);
	}
 }
class MountainBike extends Bicycle
{    //para constructor
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	public void seatHeight(int newValue)
	{
		seatHeight = newValue;
	}
	public String toString()
	{
		return(super.toString()+"\nseat height is "+seatHeight);
	}

	public int seatHeight;
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MountainBike mb = new MountainBike(3,100,25);
     System.out.println(mb.toString());
	}

}
