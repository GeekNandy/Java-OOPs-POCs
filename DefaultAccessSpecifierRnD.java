/**
 * 
 */
package com.j2se.access_specifiers;

/**
 * @author Sharad Nanda
 *
 */

public class DefaultAccessSpecifierRnD {
	
	int defaultIntVar; // making it less restrictive by adding public/protected won't cause any error but on adding private will throw compile time error
	String defaultStrVar;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OtherClassAccessingDefaultMember obj = new OtherClassAccessingDefaultMember();
		obj.TestMethod();
	}

}

class OtherClassAccessingDefaultMember{
	void TestMethod(){
		DefaultAccessSpecifierRnD obj = new DefaultAccessSpecifierRnD();
		System.out.println("Default int variable is "+obj.defaultIntVar+" and String variableis "+obj.defaultStrVar);
	}
}