package justin;
// 3 non static method in java
public class Assignment12 {

	void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("addition of two no " +sum);
	}
	void sub()
	{
		int a=20;
		int b=30;
		int sub=a-b;
		System.out.println("subtraction  of two no " +sub);
	}
	
	void div()
	{
		int a=20;
		int b=30;
		int div=b/a;
		System.out.println("division of two no " +div);
	}
	void mod()
	{
		int a=18;
		int b=2;
		int mod=b/a;
		System.out.println("modulus of two no " +mod);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Assignment12 n1=new Assignment12();
     n1.add();
     n1.sub();
     
     n1.div();
     
     n1.mod();
     
     
	}
		
	}