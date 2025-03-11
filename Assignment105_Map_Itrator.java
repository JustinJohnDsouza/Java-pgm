package justin;
//WAP to iterate a MAP

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Assignment105_Map_Itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>s1=new HashMap<Integer,String>();
		s1.put(2255, "mat");
		s1.put(2256, "wat");
		s1.put(2257, "jojo");
		s1.put(2258, "ll");
		System.out.println(s1);
		Set <Entry <Integer, String>>s2=s1.entrySet();
		Iterator <Entry <Integer, String>>s3=s2.iterator();
		while(s3.hasNext()) {
			System.out.println(s3.next());
		}
	}

}
