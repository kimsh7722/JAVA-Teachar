package Ch17EXEC;

import java.lang.reflect.Method;

public class TEST {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		
		Method[] m = 
		Class.forName("java.lang.String").getDeclaredMethods();
		
		
		for(Method x : m)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		

	}

}
