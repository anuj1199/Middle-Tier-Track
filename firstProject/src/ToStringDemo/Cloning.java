package ToStringDemo;

public class Cloning {
	
	
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Abc o=new Abc();
		o.i=5;
		o.j=6;
		
		Abc o1=(Abc)o.clone();
		o1.i=8;
		System.out.println(o);
		System.out.println(o1);
	}
}
class Abc implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "Abc [i= "+i+", j= "+j+"]";
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

