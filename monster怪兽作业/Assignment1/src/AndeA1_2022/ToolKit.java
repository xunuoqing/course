package AndeA1_2022;
import java.lang.reflect.Field;

/**
 * You do no need to edit this class. Its just a toolkit to allow me to get inside your 
 * classes to meddle with them so I can write a tester that only needs to access 
 * the method being tested. Eg if im testing damageItem I don't want to have to use 
 * addItem to put the test data in because there might be a bug in addItem. <br>
 * 
 */
public class ToolKit {
	/**
	 * This is a reflection method of getting your mits on the private variables.
	 * I wrote this so that we can test a function and not be dependent on another function 
	 * to get the result to test. <br>
	 * <br>
	 * If hard code scares and disturbs you close eyes as you scroll over this method.<br>
	 * <br>
	 * @param classInstance The object you want to access
	 * @param attributeName the name of the attribute you want
	 * @return the variable requested
	 */
	public static Object getVar(Object classInstance,final String attributeName) {
		try {
			Field attribute = getAttributeField(classInstance,attributeName);
			return attribute.get(classInstance);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		} catch  (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
			return null;
		} catch (SecurityException e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * This is a reflection method for pulling the details out of the class instance<br>
	 * <br>
	 * @param classInstance The object you want to access
	 * @param attributeName the name of the attribute you want
	 * @return the field
	 */
	public static Field getAttributeField(Object classInstance,final String attributeName) 
			throws NoSuchFieldException , SecurityException {
		Field attribute = classInstance.getClass().getDeclaredField(attributeName);
		attribute.setAccessible(true);
		return attribute;
	}


	/**
	 * This method allows use to edit integer values in the private attributes of 
	 * a class.<br>
	 * <br>
	 * @param classInstance The object you want to access
	 * @param attributeName the name of the attribute you want
	 * @param value the new value you want

	 */
	public static void setVar(Object classInstance,final String attributeName, int value) {
		try {
			Field attribute = getAttributeField(classInstance,attributeName);
			attribute.setInt(classInstance, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method allows use to edit object values in the private attributes of 
	 * a class.<br>
	 * <br>
	 * @param classInstance The object you want to access
	 * @param attributeName the name of the attribute you want
	 * @param value the new value you want
	 */
	public static void setVar(Object classInstance,final String attributeName, Object value) {
		try {
			Field attribute = getAttributeField(classInstance,attributeName);
			attribute.set(classInstance, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
