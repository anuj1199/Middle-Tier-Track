package ClassnObj;

class Car{
	private String color;
	private float price;
	private int maxSpeed;
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	
	public String getColor() {
		return color;
	}
	public float getPrice() {
		return price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
}
public class CarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setColor("Red");
		c.setPrice(100.50f);
		c.setMaxSpeed(200);
		System.out.println(c.getColor());
		System.out.println(c.getPrice());
		System.out.println(c.getMaxSpeed());
	}

}
