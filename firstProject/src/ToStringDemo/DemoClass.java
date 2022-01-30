package ToStringDemo;

public class DemoClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int i=5;
		// --------------BOXING---------------
		Integer ii=new Integer(i);//Boxing!!! 
		System.out.println(ii);
		Integer jj=i;//AutoBoxing!!!
		System.out.println(jj);
		
		//---------------UNBOXING-------------
		int j=jj.intValue();//UnBoxing!!! 
		int k=jj;//autoUnBoxing
		
		System.out.println(j);
		System.out.println(k);
	}

}
