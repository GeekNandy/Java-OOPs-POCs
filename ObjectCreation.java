/**
 * 
 */
package com.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Sharad
 *
 */
public class ObjectCreation {
	
	int id;
	String name;
	
	public ObjectCreation() {
		id = 10;
		name = "Alex";
	}
	
	public String toString() {
		return "This object has id = "+id+" and name = "+name;
	}


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		// Object creation with new keyword
		ObjectCreation objWithNew = new ObjectCreation();
		System.out.println(objWithNew.toString());
		
		// Object creation with New Instance 
		Class c = Class.forName("ObjectCreation");
		ObjectCreation objWithNewInstance = (ObjectCreation) c.newInstance();
		System.out.println(objWithNewInstance.toString());
		
		// Object creation using cloning
		ObjectCreation objClone = (ObjectCreation) objWithNew.clone();
		System.out.println(objClone.toString());
		
		// Object created using serialization and de-serialization
		ObjectCreation objWithSerialization = new ObjectCreation(); 
        FileOutputStream fo = new FileOutputStream("file.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fo); 
        oos.writeObject(objWithSerialization);
        oos.close(); 
        fo.close();
        
        ObjectCreation d; 
        FileInputStream fi = new FileInputStream("file.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fi); 
        d = (ObjectCreation)ois.readObject(); 
        System.out.println(d.toString());
        fi.close();
        ois.close();
        
        // Object creation using Reflection/newInstance() of Constructor class
        Constructor<ObjectCreation> obj = ObjectCreation.class.getDeclaredConstructor();
        ObjectCreation oc = obj.newInstance();
        System.out.println(oc.toString());
	}

}