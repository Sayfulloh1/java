 

public class StringJava{

	/* Strings in java are immutable which means if we change string obj it recreate new obj */

	public static void main(String[] args){
		String name = new String("Ibroximjon");
		System.out.println(name);	
		System.out.println(name.hashCode());
		System.out.println("hello " + name);
		System.out.println(name.charAt(5));


		String boy = "navin";
		String anotherBoy = "navin"; // boy and anotherBoy are two references of one object
		System.out.println(boy == anotherBoy); // it returns true


		// StringBuilder and StringBuffer are mutable strings in java

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());  // capacity of string buffer is always 16
		sb = new StringBuffer("navin");
		System.out.println(sb.capacity());  // here capacity is 21 because 16+5
		System.out.println(sb);
		sb.append(" chandragupta");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());


		StringBuilder sbu = new StringBuilder("ibroximjon");
		System.out.println(sbu.capacity());

		// StringBuffer and StringBuilder are almost same
		// StringBuffer is Thread Safe, but StringBuilder not
		
	}

}
