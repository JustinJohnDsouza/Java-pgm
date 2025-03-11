package justin;
//WAP with combination of static and non static methods and try calling both of them
public class Assignment13 {
 static void add() {
	 int a=10;
	 int b=60;
	 int sum=a+b;
	 System.out.println("Addition of two no " +sum);
 }
 
 static void sub() {
	 int a=100;
	 int b=60;
	 int sub=a-b;
	 System.out.println("subtraction of two no " +sub);
 }
 
  void div() {
	 int a=25;
	 int b=5;
	 int div=a/b;
	 System.out.println("division of two no " +div);
 }
  
   void mod() {
		 int a=36;
		 int b=6;
		 int mod=a%b;
		 System.out.println("modulus of two no " +mod);
	 }
public static void main(String[] args) {
	Assignment13 n1=new Assignment13();
	n1.div();
	n1.mod();
	add();
	sub();
	}
	
}
