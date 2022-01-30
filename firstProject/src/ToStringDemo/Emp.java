package ToStringDemo;

public class Emp {
	private String name;
	private int id;
	public Emp(String name, int id) {
		super();
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id +"]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp em=new Emp("Anuj",1);
		System.out.println(em);
	}

}
