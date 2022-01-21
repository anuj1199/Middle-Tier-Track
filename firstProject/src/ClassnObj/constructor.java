package ClassnObj;

public class constructor {

	
	private String name;
	private int empid;
	
	public constructor() {
		name="Anuj";
		empid=45;
	}
	
	public constructor(String s, int eid) {
		name=s;
		empid=eid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c=new constructor();
		System.out.println(c.name);
		System.out.println(c.empid);
		constructor c1=new constructor("Anuj",85);
		System.out.println(c1.name);
	}

}
