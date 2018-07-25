public class Fan {
	final static int slow=1;
	final static int medium=2;
	final static int fast=3;
	private int speed;
	private boolean turn;
	private double radius;
	String colour;
	
	
public Fan(){
	this(slow,false,5,"blue");
}
public Fan(int speed,boolean turn,double radius,String colour){
	this.speed=speed;
	this.turn=turn;
	this.radius=radius;
	this.colour=colour;

}
public int getspeed(){
return speed;
}
public boolean getturn(){
return turn;
}
public double getradius(){
return radius;
}
public 	void setspeed(int speed){
this.speed=speed;
}
public void setturn(boolean turn){
this.turn=turn;
}

public void setradius(double radius){
this.radius=radius;
}
public String toString(){
if ( getturn() ==  false) {
	return "\nFan Colour :" + colour + "\n Fan Speed :" + speed +  "\n Fan is OFF";
} else {
	return "\nFan Colour :" + colour + "\nFan Speed :" + speed + "\n Fan Radius :"+ radius + "\n Fan is ON ";
}
}

}
