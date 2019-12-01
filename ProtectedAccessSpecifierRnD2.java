/**
 * 
 */
package com.j2se.access_specifiers_2;

import com.j2se.access_specifiers.ProtectedAccessSpecifierRnD;

/**
 * @author Sharad Nanda
 *
 */
public class ProtectedAccessSpecifierRnD2 extends ProtectedAccessSpecifierRnD{

	public static void main(String[] args) {
		ProtectedAccessSpecifierRnD2 obj = new ProtectedAccessSpecifierRnD2();
		System.out.println(obj.protectedIntVar+" "+obj.protectedStrVar);
	}

}