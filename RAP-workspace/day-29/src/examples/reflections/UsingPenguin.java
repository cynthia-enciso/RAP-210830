package examples.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UsingPenguin {
	public static void main(String[] args) {
		Penguin penguin = new Penguin("Emporer Penguin");
		
		Class<?> classOf = penguin.getClass();
		
		try {
			// field
			Field species = classOf.getDeclaredField("species");
			System.out.println("Value in species field: " + species.get(penguin));
			species.set(penguin, "Little Penguin");
			System.out.println("Value in species field: " + species.get(penguin));
			
			// constructors
			Constructor<?> constructor = classOf.getDeclaredConstructor(String.class);
			System.out.println("Modifiers of constructor: " + constructor.getModifiers());
			System.out.println("get parameter count of constructor: " + constructor.getParameterCount());
			// 1 means public
			
			// methods
			Method method = classOf.getDeclaredMethod("speak", String.class);
			System.out.println("Method's return type: " + method.getReturnType());
			method.invoke(penguin, "loud"); // pass in object to use and parameter
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
