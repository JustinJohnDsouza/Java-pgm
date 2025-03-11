package justin;
import java.util.*;
//switch case
public class Assignment_106_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n1=sc.nextInt();
		switch(n1) {
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("two");
		break;
		case 3:System.out.println("three");
		break;
		case 4:System.out.println("four");
		break;
		default:System.out.println("default will excute");
		}
		
		 
		sc.close();
	}

}
