package justin;
import java.util.Scanner;

public class Assignment_30 {
//WAP to print Area of Circle using Scanner Class
	
	static double pi=3.142;
	static int r;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("pgm to calculate the area of circle");
System.out.println();
System.out.println("enter the area   ");
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
double area=pi*r*r;
System.out.println("the area of circle is  "+area);
	}
	}

		

